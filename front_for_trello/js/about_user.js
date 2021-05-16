$(document).ready(function () {
        $("#save").click(async function (){
        let varData = {
            "firstName": $("#firstName").val(),
            "lastName": $("#lastName").val(),
            "middleName": $("#middleName").val(),
            "login": $("#login").val(),
            "passwordHash": $("#password").val(),
            "newPasswordHash": $("#newpassword").val()
        };
        console.log(varData);
    });
})