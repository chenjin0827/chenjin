<html>
<head>
    <script type="text/javascript" src="resources/js/jquery-easyui/jquery.min.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("form").submit(function(e){
                alert("Submitted");
            });
        });
    </script>
</head>
<body>
<form name="input" action="" method="get">
    First name:
    <input type="text" name="FirstName" value="Mickey" size="20">
    <br />Last name:
    <input type="text" name="LastName" value="Mouse" size="20">
    <br />
    <input type="submit" value="Submit">
</form>
</body>
</html>