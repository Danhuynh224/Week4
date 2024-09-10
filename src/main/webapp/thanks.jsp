<%--
    Document   : thanks
    Created on : Aug 28, 2024, 12:05:05?PM
    Author     : ASUS
--%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8"><!-- comment -->
    <title>Murach</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
<h1>Thanks for joining ours survey </h1>
<p> Here is the information that you entered:</p>

<label> Email:</label>
<span> ${user.email}</span><br>
<label>First Name:</label>
<span> ${user.firstName}</span><br>
<label> Last Name:</label>
<span> ${user.lastName}</span><br>
<label> Day of birth:</label>
<span> ${user.doB}</span><br>
<h1>How did you hear about us?</h1> <br>
<span>${user.hearAboutMe}</span>
<h1>Would you like to receive announcements about new CDs d special offers ?</h1>
<span>${user.receive}</span>
<h1>Please contact me by: </h1>
<span>${user.contact}</span>
<br>
<p>To enter another email address, click on the Back button in your browser or the Return button shown below.</p>

<form action="" methods="get">
    <input type="hidden" name="action" values="join">
    <input type="submit" values="Return">
</form>

</body>
</html>
