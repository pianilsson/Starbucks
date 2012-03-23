

EME.Photo = DS.Model.extend({
    primaryKey: 'id',
    id: DS.attr('string'),
    imageTitle: DS.attr('string'),
    imageUrl: DS.attr('string')
});

EME.PhotoListController = Em.ArrayProxy.create({
    content: [],
    selected: null
});

EME.SelectedPhotoController = Em.Object.create({
    contentBinding: 'EME.PhotoListController.selected'
});