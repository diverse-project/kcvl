package fr.inria.diverse.kcvl.derivationengine.execderivation.core;

import fr.familiar.test.FMLTest;
import fr.familiar.variable.FeatureModelVariable;



public class ToFamiliar extends FMLTest{

	public String generateReport(String FM) throws Exception{

		
//		FeatureModelVariable fmv1 = FM("fm1", "FM (A : (B|C|D); B <-> C  ; )");
		
		super.setUp();
		
		FeatureModelVariable fmv2 = FM("fm1", FM);

		
//		 org.xtext.example.mydsl.fML.OpSelection op;
		 
/*		ConfigurationVariable cv = new ConfigurationVariableSPLOTImpl(fmv2,  "fm2") ;
		cv.applySelection("A1", OpSelection.SELECT);
		System.err.println(cv.applySelection("A2", OpSelection.SELECT));
	*/	
		
		StringBuilder b = new StringBuilder();
		
		b.append("--------------------------------------------------------------------\n");
		b.append("Modèle valide = "+ fmv2.isValid() + "\n");

		b.append("Nombre de configuration(s) valide(s) = "+ fmv2.counting() + "\n");
		
		b.append("Liste des choix inselectionnables = "+ fmv2.deads() + "\n");
		b.append("Liste des choix automatiquement sélectionnés = "+ fmv2.cores() + "\n");
		b.append("--------------------------------------------------------------------\n");
		this.tearDown();

		return b.toString();
		
			

	}

}
