'use strict';

appControllers.controller('MainController', ['$rootScope', '$scope', '$http', 'authorization',
    function($rootScope, $scope, $http, authorization) {
        $scope.status = 'running...';
        $scope.profile = authorization.profile;
        $scope.isAdmin = authorization.hasRealmRole('admin')
        $scope.isManager = authorization.hasRealmRole('manager')
        
        $scope.getInvoices = function() {
        	$http.get("http://localhost:8000/api/invoices").success(function(data) {
            	$scope.invoices = data;
            });
        }
        
        $scope.logout = function() {
        	authorization.logout();
        }
    }
]);