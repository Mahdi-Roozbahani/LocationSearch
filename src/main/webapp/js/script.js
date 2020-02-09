$(document).ready(function() {
		

	$.ajax({
		type: 'POST',
		url: '/hello/postItLocalSearch',
		data: {'Email': 'mahdir@gatech.edu','Password':'seriously','Name':'Mahdi' },
		success: function(dataFromServer) {
			var result = JSON.parse(dataFromServer);
			$("#firstDivID").text(result);
			//alert('Just got back from server side!! with '+ dataFromServer)
		},
		error: function() {
			alert('Something bad happened in our server !!')
		}
		});
	
	

	

});