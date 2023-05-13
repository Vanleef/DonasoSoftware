package gui;

public class EditarPerfilController {

	public void voltar(){
		try{
			ScreenManager.getInstance().getMenuCliente();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void sair(){
		try{
			ScreenManager.getInstance().getTelaInicio();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	public void produto(){
		try{
			ScreenManager.getInstance().getTelaProduto();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
}
