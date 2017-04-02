$(function() {

  var customMarker;
  var map;
  // var map = new google.maps.Map(document.getElementById('map'), {
  //                                                  zoom: 15,
  //                                                  center: new google.maps.LatLng(17.4491,78.377861),
  //                                                  mapTypeId: google.maps.MapTypeId.ROADMAP
  //                                             });

  var locations = [ ];

  $.ajax({ type : 'GET',
          url : 'http://127.0.0.1:8080/recomend',
          dataType : 'json',
          success : function(response) {
            //console.log('Whole Data:' + JSON.stringify(response));

            console.log('so: ', response.data);
            var dataInfo=response.data;

            for(var i=0;i<dataInfo.length;i++){
               console.log('Data:: ',dataInfo[i]);
               var info=dataInfo[i];
              locations.push(info);

            }
            //17.449,78.37786
             console.log('locations: ', locations);
             myFunction(locations);
             myFunction1();



          }
          ,
          error : function(xhr) {
            console.log('Tab count: error');
            //Do Something to handle error
            //document.alert("Wrong data")
          }

        });//end of ajax call

function myFunction(locations) {

             map = new google.maps.Map(document.getElementById('map'), {
                                                 zoom: 15,
                                                 center: new google.maps.LatLng(17.4491,78.377861),
                                                 mapTypeId: google.maps.MapTypeId.ROADMAP
                                            });



            var infowindow = new google.maps.InfoWindow;

            var marker, i;

            for (i = 0; i < locations.length; i++) {
               console.log('locations:============>>>> ', locations[i]);
                marker = new google.maps.Marker({

                     position: new google.maps.LatLng(locations[i][1], locations[i][2]),
                     map: map
                });

                google.maps.event.addListener(marker, 'click', (function(marker, i) {
                     return function() {
                         infowindow.setContent(locations[i][0]);
                         infowindow.open(map, marker);
                     }
                })(marker, i));
              }              // The function returns the product of p1 and p2
}
 function myFunction1(locations) {
          google.maps.event.addListener(map, 'click', function(event) {
                                      console.log("Mouse clicked on map,"+event.latLng);
                                      placeMarker(map, event.latLng);
                                      });
}

function placeMarker(map, location) {
  console.log(location);
  if (customMarker) {
    customMarker.setMap(null);
  }
  customMarker = new google.maps.Marker({
    position: location,
    map: map,
    icon: new google.maps.MarkerImage("http://maps.google.com/mapfiles/ms/icons/blue-dot.png")
  });

  $('#btn-nearby').removeAttr('disabled');
}



$('#btn-nearby').on('click', function(e) {
  // TODO: make a request to get recommendations in selected area
  $.ajax({
    type: 'POST',
    url: 'url',
    success: function(data, body) {
      console.log(data, body);
      for (let venue of data.data) {
        let pos = new google.maps.LatLng(venue.lat, venue.long);
        //placeMarker(map, pos);
      }
    },
    error: function(response, err) {
      console.error(response, err);
    }
  });
})
});
