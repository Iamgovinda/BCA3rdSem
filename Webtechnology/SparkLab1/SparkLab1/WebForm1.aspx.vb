Imports NepaliCalendarBS

Public Class WebForm1
    Inherits System.Web.UI.Page
    Dim myDate As NepaliDate
    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        span_today.InnerText = NepaliCalendar.TodayBS().ToString()

        myDate = NepaliCalendar.TodayBS()
        BindControl()
    End Sub
    Public Sub BindControl()
        'Bind Control using Array as data source
        Dim arr_month() = {"Baisakh", "Jestha", "Ashad", "Shrawan", " Bhadra", "Asoj", "kartik", "manghsir", "push", "magh", "Falgun", "Chaitra"}
        lstMonth.DataSource = arr_month

        lstMonth.DataBind()
        lstMonth.SelectedIndex = myDate.Month - 1

        'Using unbounded control and adding Items using loop
        lstYear.Items.Clear()
        For x = 2050 To 3090
            lstYear.Items.Add(x)
        Next

        'lstYear.SelectedValue = myDate.Year



    End Sub

    Protected Sub btnGet_Click(sender As Object, e As EventArgs) Handles btnGet.Click

    End Sub



End Class