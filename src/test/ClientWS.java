package test;

import java.rmi.RemoteException;

import ws.BanqueServiceProxy;
import ws.Compte;

public class ClientWS {

	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
				BanqueServiceProxy proxy=new BanqueServiceProxy();
				System.out.println(proxy.conversionEuroToDH(34));
				Compte compte = proxy.getCompte(3);
				System.out.println("Code="+compte.getCode());
				System.out.println("Solde="+compte.getSolde());
				Compte[] comptes=proxy.listComptes();
				for (Compte cp : comptes) {
					System.out.println("----------------");
					System.out.println("Code="+cp.getCode());
					System.out.println("Solde="+cp.getSolde());
				}
	}

}
