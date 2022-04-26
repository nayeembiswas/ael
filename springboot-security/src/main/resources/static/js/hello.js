$(document).ready(function() {
	var token = window.localStorage.getItem('access_token');
	if (token == null) {
		window.location.replace("/");
	}
	else {
		getHello();
	}

})

function getHello() {
	var token = window.localStorage.getItem('access_token');
	$.ajax({
		url: "/sec-api/hello",
		method: "GET",
		headers: {
			'Authorization': `Bearer ${token}`,
		},
		dataType: "json",
		success: function(data) {
			console.log(data.data[0]);
			var dashboardBody = $('#dashboardInfo');
			dashboardBody.empty();

			$(data.data).each(
				function(index, element) {
					dashboardBody.html(

						'<div class="container">'
						+ '<h3> ' + element.message+ '</h3>'				
						+ '</div>'
						);


					
						
				})

		}
	})
}


function logout() {

	window.localStorage.removeItem("access_token");
	window.location.replace("/");
}
