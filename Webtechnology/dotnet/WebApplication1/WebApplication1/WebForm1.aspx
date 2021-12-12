<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="WebForm1.aspx.vb" Inherits="WebApplication1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>
<body>
    <form id="form1" runat="server">
        Enter Your name: <asp:TextBox ID="TextBox1" runat="server"></asp:TextBox>
        <br />
        Enter Number of time you want to print: <asp:TextBox ID="TextBox2" runat="server"></asp:TextBox>
        <br />
        <asp:Button ID="Button1" runat="server" Text="PrintYourName" />
    </form>
    <div id="Namediv" runat="server"></div>
</body>
</html>
