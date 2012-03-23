EME = Em.Application.create({
    ready: function() {
        this._super();
    }
});

EME.store = DS.Store.create();






/*
App.MyView = Em.View.extend({
	mouseDown : function() {
		window.alert("hello world!");
	}
});


var Coffee = Ember.Object.extend({
	
	coffees: [ { name: 'machiato' },
	            { name: 'latte' },
	            { name: 'ristretto' },
	            { name: 'cappucino' },
	            { name: 'espresso' } ]
	
	coffeeList : function() {

		// get new coffee types from server and replace existing list
		
		
		return coffees;
	}

	
});


App.CoffeeView = Em.View.extend({
	
	coffees: [ { name: 'machiato' },
	            { name: 'latte' },
	            { name: 'ristretto' },
	            { name: 'cappucino' },
	            { name: 'espresso' } ]
});


App.PeopleView = Ember.View.extend({
	  people: [ { name: 'Yehuda' },
	            { name: 'Tom' } ]
	});
	*/

