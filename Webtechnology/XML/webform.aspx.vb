Imports MySql.Data.MySqlClient

Public Class address_book
    Inherits System.Web.UI.Page

    Protected Sub Page_Load(ByVal sender As Object, ByVal e As System.EventArgs) Handles Me.Load
        If Not IsPostBack Then
            GetData()
        End If
    End Sub

    Protected Sub btnSubmit_Click(sender As Object, e As EventArgs) Handles btnSubmit.Click
        InsertData()
        Clear()
        GetData()
    End Sub

    Protected Sub btnCancel_Click(sender As Object, e As EventArgs) Handles btnCancel.Click
        Clear()
    End Sub

    Private Sub GetData()
        Dim constr As String = ConfigurationManager.ConnectionStrings("mySql").ConnectionString
        Dim sql As String = "SELECT * FROM address_book"

        Using con As New MySqlConnection(constr)
            Using cmd As New MySqlCommand(sql)
                Using sda As New MySqlDataAdapter()
                    cmd.Connection = con
                    sda.SelectCommand = cmd
                    Using ds As New DataSet()
                        sda.Fill(ds)
                        GridViewAddressBook.DataSource = ds
                        GridViewAddressBook.DataBind()
                    End Using
                End Using
            End Using
        End Using
    End Sub

    Private Sub Clear()
        txtName.Text = String.Empty
        ddlGender.Text = "Male"
        txtPhoneNo.Text = String.Empty
        txtEmail.Text = String.Empty
        txtName.Focus()
    End Sub

    Private Sub InsertData()
        Dim constr As String = ConfigurationManager.ConnectionStrings("mySql").ConnectionString

        Dim sql As String = "INSERT INTO address_book (name, email, phone_no, gender) VALUES 
            ('" & txtName.Text.Trim() & "', '" & txtEmail.Text.Trim() & "', '" &
            txtPhoneNo.Text.Trim() & "', '" & ddlGender.Text.Trim() & "')"
        Using con As New MySqlConnection(constr)
            con.Open()
            Using cmd As New MySqlCommand(sql, con)
                cmd.ExecuteNonQuery()
            End Using
            con.Close()
        End Using
    End Sub


End Class