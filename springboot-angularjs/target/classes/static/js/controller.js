app.controller('usersController', function($scope, $http) {

	$scope.headingTitle = "User List";
	$scope.users = null;

	$http.get('/getUsers/').success(function(data) {
		$scope.users = data;
	})
});

app.controller('rolesController', function($scope, $http) {
	$scope.headingTitle = "Roles List";

	$scope.roles = null;

	$http.get('/getRoles/').success(function(data) {
		$scope.roles = data;
	})
});
