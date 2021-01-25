def show_guayaquil():
    print ("You select guayaquil\n")
    mapa=folium.Map(location=[-2,-78],zoom_start=7,control_scale=True, tiles="openStreetMap")
    feature_group=folium.FeatureGroup(name="Centro Historico Guayaquil")
    folium.Marker(location=[-2.1449, -79.8705]).add_to(feature_group)
    mapa.add_child(feature_group)
    mapa.add_child(folium.map.LayerControl());
    mapa.save("C:\\Users\\Usuario\\Desktop\\guayaquil.html")
# map the inputs to the function blocks
options = {0 : show_Molinuco,
           1 : show_cotopaxi,
           2 : show_guayaquil
}