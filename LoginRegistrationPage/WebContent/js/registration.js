  function registration()
	{

		var name= document.getElementById("name").value;
		var password= document.getElementById("password").value;
		var phonenumber= document.getElementById("phonenumber").value;
		var address= document.getElementById("address").value;			
		
		if(name=='')
		{
			alert('Please enter your name');
			document.getElementById("name").focus();
			return false;
		}
		
		else if(password=='')
		{
			alert('Please enter Password');
			return false;
		}
		else if(phonenumber=='')
		{
			alert('Enter Confirm Password');
			return false;
		}
		
		else if(address=='')
			{
			alert('Enter Confirm Password');
			return false;
			}
		else
		{				                            
             alert('Thank You for Login');
             return true;
			   
		}
		return true;
	}

