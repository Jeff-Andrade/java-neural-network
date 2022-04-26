package NN;

import java.util.ArrayList;

public class Layer

{

    public ArrayList<Double> layerOutput = new ArrayList<Double>();
    public ArrayList<Double> layerInput = new ArrayList<Double>();
    public ArrayList<Neuron> neurons = new ArrayList<Neuron>();
    public int inputSize;
    public int neuronAmount;
    public String layerActivation;

    public void populate_layer()

    {

        for (int i = 0; i < this.neuronAmount; i++)

        {

            Neuron n = new Neuron();

            n.inputSize = this.inputSize;
            n.generate_values();

            neurons.add(n);

        }

    }

    public void generate_output()

    {

        for (int i = 0; i < this.neurons.size(); i++)

        {

            neurons.get(i).neuronInput = this.layerInput;

            neurons.get(i).dot_product();

            if (this.layerActivation == "sigmoid")

            {

                this.layerOutput.add(Activation.sigmoid(neurons.get(i).neuronOutput));

            }

            else if (this.layerActivation == "tanh")

            {

                this.layerOutput.add(Activation.tanh(neurons.get(i).neuronOutput));

            }

            else if (this.layerActivation == "relu")

            {

                this.layerOutput.add(Activation.relu(neurons.get(i).neuronOutput));

            }

            else

            {

                this.layerOutput.add(neurons.get(i).neuronOutput);

            }

        }

    }

}