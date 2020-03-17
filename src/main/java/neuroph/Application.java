package neuroph;

import org.neuroph.core.data.DataSet;
import org.neuroph.core.data.DataSetRow;
import org.neuroph.nnet.MultiLayerPerceptron;

/**
 * @author antoinethebault
 *Application : classe executable permettant de modeliser la porte OU 
 *avec la librairie neuroph
 */
public class Application {

	public static void main(String[] args) {
		/**neuralNetwork: MultiLayerPerceptron : prend en parametre le nombre d'entrees,
		 * de neurones caches et de sorties*/
		MultiLayerPerceptron neuralNetwork = new MultiLayerPerceptron(2, 1, 1);
		
		//apprentissage
		/**dataSet: DataSet : prend en parametre le nombre d'entrees et de sorties*/
		DataSet dataSet = new DataSet(2, 1);
		
		/**DataSetRow : prend en parametre des valeurs d'entrees et de sorties*/
		DataSetRow rOne = new DataSetRow(new double[] {1, 1}, new double[]{1}); 
		DataSetRow rTwo = new DataSetRow(new double[] {0, 0}, new double[]{0}); 
		DataSetRow rThree = new DataSetRow(new double[] {0, 1}, new double[]{1}); 
		DataSetRow rFour = new DataSetRow(new double[] {1, 0}, new double[]{1}); 
		dataSet.addRow(rOne);
		dataSet.addRow(rTwo);
		dataSet.addRow(rThree);
		dataSet.addRow(rFour);
				
		for (int i=0;i<20;i++)
			neuralNetwork.learn(dataSet) ;
		
		//calcul
		neuralNetwork.setInput(0,0);
		neuralNetwork.calculate();
		for (double output: neuralNetwork.getOutput())
			System.out.println(output); 
		
		neuralNetwork.setInput(0,1);
		neuralNetwork.calculate();
		for (double output: neuralNetwork.getOutput())
			System.out.println(output); 

		neuralNetwork.setInput(1,0);
		neuralNetwork.calculate();
		for (double output: neuralNetwork.getOutput())
			System.out.println(output); 
		
		neuralNetwork.setInput(1,1);
		neuralNetwork.calculate();
		for (double output: neuralNetwork.getOutput())
			System.out.println(output); 
	}

}
