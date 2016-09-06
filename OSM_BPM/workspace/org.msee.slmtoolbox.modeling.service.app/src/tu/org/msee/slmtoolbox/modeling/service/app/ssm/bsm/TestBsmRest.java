package tu.org.msee.slmtoolbox.modeling.service.app.ssm.bsm;

import java.io.Reader;
import java.io.StringReader;

import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.BsmRESTService;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.RESTClient;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseAssetClassBeanREST;
import org.msee.slmtoolbox.modeling.service.app.ssm.bsm.bean.MseServiceBeanREST;

import com.google.gson.Gson;
import com.google.gson.JsonParser;

public class TestBsmRest {

	public static void main(String[] args) {
        /*System.out.print("services/local : \n");
		requestRest("http://mseassetrepo.apiary.io/services/local");
        System.out.print(" services/public :\n");
		requestRest("http://mseassetrepo.apiary.io/services/public");
        System.out.print(" services/local/1 :\n");
		requestRest("http://mseassetrepo.apiary.io/services/local/1");
        System.out.print(" services/public/1 : \n");
		requestRest("http://mseassetrepo.apiary.io/services/public/1");
        System.out.print("classes :  \n");
		requestRest("http://mseassetrepo.apiary.io/classes");*/
		
		/*BsmRESTService restService = new BsmRESTService();
        System.out.print("BsmRESTService.getAllPublicService():  \n");
        List<BsmMseService> list = restService.getAllPublicService();
        for(BsmMseService service : list) {
            System.out.print(service.getType() +" - " + service.getName() + " : ");
            if (null != service.getOrganization()) {
                System.out.print(service.getOrganization().getName() + " , " );
            }
            System.out.print(service.getCreateDate() + "\n");
        }
        System.out.print("\nBsmRESTService.getAllLocalService():  \n");
        list = restService.getAllLocalService();
        for(BsmMseService service : list) {
            System.out.print(service.getType() +" - " + service.getName() + " : ");
            if (null != service.getOrganization()) {
                System.out.print(service.getOrganization().getName() + " , " );
            }
            System.out.print(service.getCreateDate() + "\n");
        }*/
		/*useGson("http://mseassetrepo.apiary.io/services/local");
		useGson("http://mseassetrepo.apiary.io/services/public");*/
		
		BsmRESTService service = new BsmRESTService();
		MseAssetClassBeanREST assets = service.getAllMseAssets();
		show(assets);
		
	}

    private static void show(MseAssetClassBeanREST asset) {
        System.out.print(asset.name +"(" + asset.namespace + " - " + asset.nameClassReference +")\n");
        if (null != asset.children) {
	        for (MseAssetClassBeanREST child : asset.children) {
	        	show(child);
	        }
        }
	}

	public static void useGson(String url) {
		RESTClient rest = new RESTClient(url);
		String callServiceLocal = rest.call();
     
        Gson gson = new Gson();
        Reader reader = new StringReader(callServiceLocal);
        MseServiceBeanREST[] results = gson.fromJson(reader, MseServiceBeanREST[].class);
        
        
        for (int i = 0 ; i < results.length; i++) {
        	MseServiceBeanREST result = results[i];
            System.out.print(result.idService +" - " + result.name + " : ");
            System.out.print(result.owner + " , " );
            System.out.print(result.created + "\n");
        }
        
    }
}
