

        function validate() {
            var username = document.getElementById("username").value;
            var password = document.getElementById("password").value;
            if (username == null || username == "") {
             document.getElementById("unameError").innerHTML = "Please enter username";                
                return false;
            }
            else if (password == null || password == "") {
                document.getElementById("passError").innerHTML = "Please enter the password";
                return false;
            }
            
            return true;
        } 























/*function validate() {
	
	var username = document.getElementById('username');
	var password = document.getElementById('password');
	if (username.value == "" && username.value.length < 3
			&& password.value == "" && password.value.length < 6) {
		if (username.value == "") {
			document.getElementById('username').innerText = "Username is required";
			return false;
		}
		if (password.value == "") {
			document.getElementById('password').innerText = "Password is required";
			return false;
		}

	}
	return true;
}*/
