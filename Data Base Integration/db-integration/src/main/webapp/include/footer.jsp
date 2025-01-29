<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Sticky Footer Example</title>
    <!-- Font Awesome for social icons -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        /* Ensure the body and html take the full height */
        html, body {
            height: 100%;
            margin: 0;
            display: flex;
            flex-direction: column;
        }

        /* Wrapper for content to push the footer down */
        .content-wrap {
            flex: 1; /* This pushes the footer to the bottom */
        }

        /* Footer styling */
        #footerwrap {
            background: #333; /* Set footer background color */
            color: white; /* Set footer text color */
            padding: 20px 0;
            text-align: center; /* Center align text for simplicity */
        }

        #footerwrap h4 {
            margin-bottom: 10px;
            font-size: 18px;
        }

        #footerwrap p {
            margin: 0; /* Ensure no extra spacing inside the footer */
            line-height: 1.5;
        }

        .hline-w {
            border-top: 2px solid white; /* Example for divider styling */
            width: 50px;
            margin: 10px auto; /* Center the divider */
        }

        #footerwrap .fa {
            margin: 0 10px; /* Space between social icons */
            color: white; /* Icon color */
            text-decoration: none; /* No underline for links */
            font-size: 20px;
        }

        #footerwrap .fa:hover {
            color: #db222a; /* Change icon color on hover */
        }

        /* Responsive grid structure */
        .container {
            max-width: 1200px;
            margin: 0 auto;
            padding: 0 15px;
        }

        .row {
            display: flex;
            flex-wrap: wrap;
            gap: 20px;
        }

        .col-lg-4 {
            flex: 1 1 calc(33.333% - 20px); /* 3 equal columns with a gap */
            min-width: 200px; /* Ensure proper responsiveness */
        }
    </style>
</head>
<body>
    <!-- Content -->
    <div class="content-wrap">
        <!-- Add your main content here -->
        <div class="container">
        </div>
    </div>

    <!-- Footer -->
    <div id="footerwrap">
        <div class="container">
            <div class="row">
                <div class="col-lg-4">
                    <h4>About</h4>
                    <div class="hline-w"></div>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.</p>
                </div>
                <div class="col-lg-4">
                    <h4>Social Links</h4>
                    <div class="hline-w"></div>
                    <p>
                        <a href="#"><i class="fa fa-dribbble"></i></a>
                        <a href="#"><i class="fa fa-facebook"></i></a>
                        <a href="#"><i class="fa fa-twitter"></i></a>
                        <a href="#"><i class="fa fa-instagram"></i></a>
                        <a href="#"><i class="fa fa-tumblr"></i></a>
                    </p>
                </div>
                <div class="col-lg-4">
                    <h4>Our Bunker</h4>
                    <div class="hline-w"></div>
                    <p>
                        Some Ave, 987,<br/>
                        23890, New York,<br/>
                        United States.<br/>
                    </p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
