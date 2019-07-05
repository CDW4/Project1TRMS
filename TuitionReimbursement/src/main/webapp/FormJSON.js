function getEmployeeInfo() {

	let xhr = new XMLHttpRequest();

	

	xhr.onreadystatechange = function () {

		if (xhr.readyState === 4 && xhr.status === 200) {

			let employee = JSON.parse(xhr.responseText);

			console.log(user);

			

			displayEmployee(employee);

		} else if(xhr.readyState === 4 && xhr.status === 401) {

			alert('Your not loggedin');

		}

	}

	

	xhr.open("GET", "./userinfo", true);

	

	xhr.send();

}



function displayEmployee(employee) {

	document.getElementById("username").innerText = employee.username;

	document.getElementById("firstname").innerText = employee.firstName;

	document.getElementById("lastname").innerText = employee.lastName;

	document.getElementById("email").innerText = employee.email;

	document.getElementById("role").innerText = employee.userRole;

}



window.onload = function() {

	getUserInfo();

}