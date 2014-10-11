(function() {
	var app = angular.module('store', []);

	app.controller('StoreController', [ '$http', function($http) {
                this.polls = {}

		var store = this;
		
		var config = {headers: {
            'Authorization': 'Basic d2VudHdvcnRobWFuOkNoYW5nZV9tZQ=='
        }
       };
		
		$http.get('/shop/groups/1', config).success(function(data) {
			store.polls = data;
		});

	}]);
})();