<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="WebForm1.aspx.vb" Inherits="SparkLab1.WebForm1" %>

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head runat="server">
    <title></title>
</head>

<body>
    Today is <span runat="server" id ="span_today"></span> B.S.
    <form id="form1" runat="server">
        <asp:DropDownList ID="lstYear" runat="server" ></asp:DropDownList> 
        <asp:DropDownList ID="lstMonth" runat="server"></asp:DropDownList> 
        <asp:Button ID="btnGet" runat="server" Text="Get Calendar" />
    </form>
    
</body>
</html>
