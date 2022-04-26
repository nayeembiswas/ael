$(document).ready(function() {
	$('#message').html('');
	$('#message').hide();
})


function signin() {
	var hiddenTime = 6000;
	var signinRequest = {};


	signinRequest.username = $('#username').val();
	if (signinRequest.username == "") {
		$('#message').html('Username is empty');
		$('#message').show();
		$('#message').hide(hiddenTime);
		return;
	}
	signinRequest.password = $('#password').val();
	if (signinRequest.password == "") {
		$('#message').html('Password is empty');
		$('#message').show();
		$('#message').hide(hiddenTime);
		return;
	}

	var reqObj = JSON.stringify(signinRequest);
	$.ajax({
		url: "/api/auth/signin",
		method: "POST",
		data: reqObj,
		contentType: 'application/json; charset=utf-8',
		success: function(res) {
			if (res.data == null) {
				$('#message').html(res.message);
				$('#message').show();
				$('#message').hide(hiddenTime);
			} else {
				/*$('#message').html(res.data.token);
				$('#message').show();*/
				/*$('#message').hide(hiddenTime);*/
				window.localStorage.setItem('access_token', res.data.token);
				window.location.replace("/hello");
			}

			resetEmployee();
		},
		error: function(error) {
			$('#message').html("Signin failed");
			$('#message').show();
			$('#message').hide(hiddenTime);
		}
	})
}


// Reser Signup from data
function resetEmployee() {
	$('#username').val('');
	$('#password').val('');
}



