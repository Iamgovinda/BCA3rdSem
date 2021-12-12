<%@ Page Language="vb" AutoEventWireup="false" CodeBehind="address_book.aspx.vb" Inherits="SparkLab1.address_book" %>
    <!DOCTYPE html>
    <html xmlns="http://www.w3.org/1999/xhtml">
    <head runat="server">
        <title></title>
    </head>

    <body>
        <div class="section">
            <h1>My Personal Address Book</h1>
            <form id="form1" runat="server">
                <div>
                    <table>
                        <tr>
                            <td class="auto-style2">
                                <asp:Label ID="Label1" runat="server" Text="Name"></asp:Label>
                            </td>
                            <td>
                                <asp:TextBox ID="txtName" runat="server"></asp:TextBox>
                            </td>
                        </tr>
                        <tr>
                            <td class="auto-style2">
                                <asp:Label ID="Label3" runat="server" Text="Email"></asp:Label>
                            </td>
                            <td>
                                <asp:TextBox ID="txtEmail" runat="server"></asp:TextBox>
                            </td>
                        </tr>
                        <tr>
                            <td class="auto-style2">
                                <asp:Label ID="Label4" runat="server" Text="Phone No"></asp:Label>
                            </td>
                            <td>
                                <asp:TextBox ID="txtPhoneNo" runat="server"></asp:TextBox>
                            </td>
                        </tr>
                        <tr>
                            <td class="auto-style2">
                                <asp:Label ID="Label2" runat="server" Text="Gender"></asp:Label>
                            </td>
                            <td>
                                <asp:DropDownList ID="ddlGender" runat="server">
                                    <asp:ListItem Value="Male"></asp:ListItem>
                                    <asp:ListItem Value="Female"></asp:ListItem>
                                </asp:DropDownList>
                            </td>
                        </tr>
                        <tr>
                            <td class="auto-style1">
                                &nbsp;
                            </td>
                            <td>
                                <asp:Button ID="btnSubmit" runat="server" Text="Submit" OnClick="btnSubmit_Click" />
                                <asp:Button ID="btnCancel" runat="server" Text="Cancel" OnClick="btnCancel_Click" />
                            </td>
                        </tr>
                    </table>
                </div>
                <div style="padding: 10px; margin: 0px; width: 100%;">
                    <p>
                        Total Student:<asp:Label ID="lbltotalcount" runat="server" Font-Bold="true"></asp:Label>
                    </p>
                    <asp:GridView ID="GridViewAddressBook" runat="server" DataKeyNames="id" />
                </div>
            </form>
        </div>
    </body>

    </html>