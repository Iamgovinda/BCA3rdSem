Public Class WebForm1
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load

    End Sub

    Protected Sub TextBox2_TextChanged(sender As Object, e As EventArgs) Handles TextBox2.TextChanged
        Dim name As String = TextBox1.Text
        Dim num As Integer = Val(TextBox2.Text)

        For counter As Integer = 1 To num
            Response.Write(name + "<br/>")

        Next

    End Sub
End Class