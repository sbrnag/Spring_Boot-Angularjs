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

app.controller('formController', function($scope, $http) {
	$scope.headingTitle = "save user";
	
	$scope.user = {};
	$scope.users = [];

	$scope.submit = function() {
		
		$http.post('/saveUser', $scope.user)
        .then(
            function (response) {
                $scope.users.push($scope.user);
                $scope.user = {};
            },
            function (errResponse) {
               console.error('Error while creating User : '+errResponse.data.errorMessage);
               alert('error');
            }
        );
		
	};

	
});
