import cd.controller.CdController;
import cd.domain.mediator.CdModel;
import cd.domain.mediator.CdModelManager;
import cd.view.CdConsole;
import cd.view.CdView;

public class Main
{
	public static void main(String args[])
	{
		try
		{
			CdModel model = new CdModelManager();
			CdView view = new CdConsole();
			CdController controller = new CdController(model, view);

			view.start(controller);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
