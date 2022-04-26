package NN;

import java.util.ArrayList;

public class Network

{

    private ArrayList<Double> networkInput = new ArrayList<Double>();
    private ArrayList<Integer> neuronsInLayer = new ArrayList<Integer>();
    public ArrayList<Layer> networkLayers = new ArrayList<Layer>();
    private String activation;

    Network(ArrayList<Double> networkInput, ArrayList<Integer> neuronsInLayer, String activation)

    {

        this.networkInput = networkInput;
        this.neuronsInLayer = neuronsInLayer;
        this.networkLayers = new ArrayList<Layer>();
        this.activation = activation;

        this.populate_network();
        this.forward();

    }

    private void populate_network()

    {

        for (int i = 0; i < this.neuronsInLayer.size(); i++)

        {

            if (i == 0)

            {

                Layer l = new Layer();

                l.inputSize = this.networkInput.size();
                l.neuronAmount = this.neuronsInLayer.get(i);
                l.layerActivation = this.activation;
                l.populate_layer();

                this.networkLayers.add(l);

            }

            else

            {

                Layer l = new Layer();

                l.inputSize = this.neuronsInLayer.get(i - 1);
                l.neuronAmount = this.neuronsInLayer.get(i);
                l.layerActivation = this.activation;
                l.populate_layer();

                this.networkLayers.add(l);

            }

        }

    }

    private void forward()

    {

        for (int i = 0; i < this.networkLayers.size(); i++)

        {

            if (i == 0)

            {

                this.networkLayers.get(i).layerInput = this.networkInput;
                this.networkLayers.get(i).generate_output();

            }

            else

            {

                this.networkLayers.get(i).layerInput = this.networkLayers.get(i - 1).layerOutput;
                this.networkLayers.get(i).generate_output();

            }

        }

        System.out.println(this.networkLayers.get(this.neuronsInLayer.size() - 1).layerOutput);

    }

}