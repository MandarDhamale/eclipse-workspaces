<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>HTML Form using Servlets</title>
</head>
<body>
    <!-- <h2>Submitting form to servlet</h2> -->
    <form action="<%= request.getContextPath() %>/Controller" method="post">
        <!-- Full Name -->
        <label for="fullname">Full Name:</label>
        <input type="text" id="fullname" name="fullname" required><br><br>

        <!-- Gender -->
        <label>Gender:</label>
        <input type="radio" id="male" name="gender" value="Male">
        <label for="male">Male</label>
        <input type="radio" id="female" name="gender" value="Female">
        <label for="female">Female</label><br><br>

        <!-- Languages Known -->
        <label for="languages">Languages Known:</label><br>
        <input type="checkbox" id="hindi" name="languages" value="Hindi">
        <label for="hindi">Hindi</label><br>
        <input type="checkbox" id="english" name="languages" value="English" checked>
        <label for="english">English</label><br>
        <input type="checkbox" id="french" name="languages" value="French">
        <label for="french">French</label><br><br>

        <!-- Country -->
        <label for="country">Country:</label>
        <select id="country" name="country" required>
            <option value="India">India</option>
            <option value="USA">USA</option>
            <option value="UK">UK</option>
        </select><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>
