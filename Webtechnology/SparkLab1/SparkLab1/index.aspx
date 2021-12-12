<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="index.aspx.vb" Inherits="SparkLab1.index" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title>Hello</title>
</head>
<body>
    <form id="form1" runat="server">s
        <div>
           <%
               'This is comment
               'Declearing Variables
               'Dim num As Integer = 10
               Dim str As String = "Hello <br/>"
               Dim names() As String = {"Bhim Prakash Sunuwar", "Gobinda Parsad Jamakatel", "Junu Darnal", "Lokesh Gurung",
                      "Riya Dhaubanzar", "Sangay Dorje Tamang", "Manas Neupane", "Manisha Shrestha", "Nitesh Mahat",
                      "Rohit KC", "Raju Naupane", "Karan Kumar Katuwal"}

               names(0) = "Hello Bhim"
               For Each name In names
                   Response.Write(name & "<br>")
               Next

               'For i = 1 To 10
               '    Dim str1 As String
               '    str1 = "2 x " & i & " = " & (2 * i) & "<br>"
               '    Response.Write(str1)
               'Next
               '2 x 1 = 2
               '2 x 2 = 4

               'Response.Write("<br><br><br>")
               'Dim x As Integer = 5
               'If x = 1 Then
               '    Response.Write("One")
               'ElseIf x = 2 Then
               '    Response.Write("Two")
               'ElseIf x = 3 Then
               '    Response.Write("Three")
               'ElseIf x = 4 Then
               '    Response.Write("Four")
               'ElseIf x = 5 Then
               '    Response.Write("Five")
               'Else
               '    Response.Write("I don't know")
               'End If
            %>
            
        </div>
    </form>
</body>
</html>
