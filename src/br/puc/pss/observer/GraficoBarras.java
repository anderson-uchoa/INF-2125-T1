package br.puc.pss.observer;
import java.awt.Color;
import java.awt.Paint;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;

import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoBarras implements Observador {

	private DefaultCategoryDataset dataset;
	private JFrame frame = new JFrame();

	public GraficoBarras() {
		dataset = new DefaultCategoryDataset();
		JFreeChart chart = ChartFactory.createBarChart("Carteira de Ações", "Siglas", "Quantidade", dataset,
				PlotOrientation.VERTICAL, false, true, false);
		ChartPanel chartPanel = new ChartPanel(chart);
		
		CategoryPlot plot = chart.getCategoryPlot();
		plot.setBackgroundPaint(Color.white);
		plot.setDomainGridlinePaint(Color.white);
		plot.setRangeGridlinePaint(Color.white);
		plot.setOutlineVisible(false);
		
		BarRenderer renderer = (BarRenderer)plot.getRenderer();  
		renderer.setGradientPaintTransformer(null);
		renderer.setBarPainter(new StandardBarPainter());
	
		renderer.setBaseItemLabelGenerator(new StandardCategoryItemLabelGenerator());
		renderer.setBaseItemLabelsVisible(true);
		
		Paint[] colors = new Paint[] {
		                  new Color(0, 172, 178),      // blue
		                  new Color(239, 70, 55),      // red
		                  new Color(85, 177, 69)
		                  };       // green
		
		
		// change the default colors
				for (int i = 0; i < 4; i++) {
				    renderer.setSeriesPaint(i, colors[i % colors.length]);
				}
		
		

		frame.setContentPane(chartPanel);
		frame.setSize(700, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void mudancaQuantidade(String acao, Integer quantidade) {
		dataset.setValue(quantidade, "Quantidade", acao);
	}

}
