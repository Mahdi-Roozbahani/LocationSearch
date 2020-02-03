$(document).ready(function() {
		

	$.ajax({
		type: 'POST',
		contentType : "application/json",
		url: '/hello/postItLocalSearch',
		data: {'student1': 'Mahdi' },
		success: function(dataFromServer) {
			//var result = JSON.parse(dataFromServer);
			$("#firstDivID").text(dataFromServer);
			//alert('Just got back from server side!! with '+ dataFromServer)
		},
		error: function() {
		alert('Something bad happened in our server !!')
		}
		});
	
	

	

});