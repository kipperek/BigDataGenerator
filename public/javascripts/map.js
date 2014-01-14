	var loc = "Select location on the map";
			function draw2(dat){
				var height = 350;
				var width = 700;
				var centered;
				
				var svg = d3.select('#map').append('svg')
					.attr('width', width)
					.attr('height', height);
				var projection = d3.geo.mercator();
				var path = d3.geo.path()
					.projection(projection);
				var states = svg.append('g')
					.attr('id', 'states');
				states.attr('transform', 'scale(1.0,1.0)translate(-150,0)');
					
				d3.json(dat, function(collection) {
					json = collection;
					states.selectAll('path')
						.data(collection.features)
					.enter().append('path')
						.attr('d', d3.geo.path().projection(projection))
						.attr('id', function(d){return d.properties.name.replace(/\s+/g, '')})
						.classed('none_active',true)
						.on('click', click);

						function click(d) {
							var x = -150,
							y = 0,
							k = 1.0;
							
							if (d && centered !== d) {
							var centroid = path.centroid(d);
							x = -centroid[0] + width/11;
							y = -centroid[1] + height/11;
							k = 6;
							centered = d;
							} else {
							centered = null;
							}

							states.selectAll("path")
								.classed("active_loc", centered && function(d) { return d === centered; });
								
							states.transition()
								.duration(1000)
								.attr("transform", "scale(" + k + ")translate(" + x + "," + y + ")")
								.style("stroke-width", 0.5 / k + "px");

							if(centered==null){
								loc = "Select location on the map";
								$("#location_input").val(loc);
							}else{
								$("#location_input").val(centered.properties.name);
								loc = centered.properties.name;
							}
							
						}
				});
			}
			
			$(document).ready(function(){
				$("input[type=reset]").click(function(e){
					e.preventDefault();
					$("#addForm")[0].reset();
					$("#location_input").val(loc);
				});
			});