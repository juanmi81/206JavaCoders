package javacoders.controlador;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import DAO.ArticuloDAO;
import FX.ArticuloModelView;
import javacoders.modelo.Articulo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ControladorListArt implements Initializable {

	@FXML
	private TableView<ArticuloModelView> tableView;
	
	@FXML
    private TableColumn<ArticuloModelView, String> codArticuloColumn;
    @FXML
    private TableColumn<ArticuloModelView, String> descripcionColumn;
    @FXML
    private TableColumn<ArticuloModelView, String> pvpColumn;
    @FXML
    private TableColumn<ArticuloModelView, String> gastoEnvioColumn;
    @FXML
    private TableColumn<ArticuloModelView, String> tiempoPrepColumn;


	private ArticuloDAO articuloDAO;

	public ControladorListArt() {
		articuloDAO = new ArticuloDAO();
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		codArticuloColumn.setCellValueFactory(cellData -> cellData.getValue().getCodArticulo());
		descripcionColumn.setCellValueFactory(cellData -> cellData.getValue().getDescripcion());
		pvpColumn.setCellValueFactory(cellData -> cellData.getValue().getPvp());
		gastoEnvioColumn.setCellValueFactory(cellData -> cellData.getValue().getGastosEnvio());
		tiempoPrepColumn.setCellValueFactory(cellData -> cellData.getValue().getTiempoPrep());
		 
		System.out.println("ini tabla " + tableView);
		try {
			ObservableList<ArticuloModelView> lst = FXCollections.observableArrayList();

			List<Articulo> lstArticulo = articuloDAO.obtener();
			for(Articulo a: lstArticulo) {
				lst.add(new ArticuloModelView(a.getCodArticulo(), 
						a.getDescripcion(), a.getPvp(), a.getGastosEnvio(), a.getTiempoPrep()));
			}
			
			tableView.setItems(lst);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
