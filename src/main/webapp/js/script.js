$(document).ready(function() {
		

	$.ajax({
		type: 'POST',
		url: '/hello',
		data: {'student1': 'Mahdi' },
		dataType: 'json',// what we expect from server
		async: true, // what if the false one
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