<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<link href="<c:url value="/resources/css/home.css" />" rel="stylesheet">
<link href="<c:url value="http://cdn.leafletjs.com/leaflet-0.7.3/leaflet.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/MarkerCluster.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/MarkerCluster.Default.css" />" rel="stylesheet">

<script src="//cdn.leafletjs.com/leaflet-0.7.3/leaflet.js" ></script>
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>  
<script type="text/javascript" src="<c:url value="/resources/js/leaflet.markercluster.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/leaflet.geocsv.js" />"></script>
<title>Object</title>
</head>
<body>
        <H1>Object</H1>
        <a href="index">Home</a>
         <BR>
         <div id="mapdiv" style="height:500px">There is a map</div>
         <div id="locations" style="white-space:pre; display:none" >
<c:if test="${!empty mapList}">
		<c:forEach items="${mapList}" var="map">
${map.longitude},${map.latitude},${map.city},${map.address}
		</c:forEach>
</c:if>
	</div>
     
    <script type="text/javascript">
    var value = "<%=request.getParameter ("address")%>";
    //alert(value);
    arr = value.split(',');
    //alert( arr[0] );
    //alert( arr[1] );
    var a = arr[0];
    var b = arr[1];
    map = L.map('mapdiv').setView([a, b],17);
	var tile_options = {
    subdomains: '1234', // Using multiple subdomains allows the user to download more tiles at a time so 
    attribution: 'Map data OpenStreeMaps and MapQuest'
};

// Now we add the actual tile layer
var basemap = L.tileLayer('http://otile{s}.mqcdn.com/tiles/1.0.0/map/{z}/{x}/{y}.png',tile_options);
basemap.addTo(map);

// Options for the CSV data
var csv_options = {
    fieldSeparator: ',',
    titles: ['lng','lat','ignore','popup'],
    onEachFeature: function(feature,layer){
        layer.bindPopup("<p>" + feature.properties.popup +"</p>");
    }
};

var csvContents = document.getElementById('locations').innerHTML;
var geoLayer = L.geoCsv(csvContents,csv_options);
//map.addLayer(geoLayer);

var clusterOptions = {
    maxClusterRadius: 30
};

var markers = new L.MarkerClusterGroup(clusterOptions);
markers.addLayer(geoLayer);
map.addLayer(markers);

</script>
    </BODY>
</HTML>