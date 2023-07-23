package br.com.cod3r.memento.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;

import br.com.cod3r.memento.swing.component.TextAreaWithMemory;
import br.com.cod3r.memento.swing.component.TextAreaWithMemory.TextAreaMemento;
import br.com.cod3r.memento.swing.memory.Caretaker;

// TODO: review Memento
/*
	- A intenção do padrão memento é oferecer uma forma de armazenar o estado
	de um determinado objeto para que seja possível restaurá-lo e utilizá-lo
	para algum fim posteriormente. 
	- No exemplo em questão, temos uma interface gráfica com um textArea que
	possilita salvar o texto atual e restaurá-lo posteriormente. O salvamento
	acontece com o auxílio de um caretaker, que recebe e armazena os estados em uma
	lista. Posterior a isso, é possível percorrer essa lista de estados e restaurar
	cada um deles.
*/

public class Client {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Memento");
		frame.setLayout(new BorderLayout());

		JButton previous = new JButton("<<");
		JButton next = new JButton(">>");

		frame.add(previous, BorderLayout.WEST);
		frame.add(next, BorderLayout.EAST);

		TextAreaWithMemory originator = new TextAreaWithMemory(5, 10);
		JScrollPane scroll = new JScrollPane(originator, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		frame.add(scroll, BorderLayout.CENTER);

		JPanel bottomPanel = new JPanel(new FlowLayout());
		JComboBox<String> mementosList = new JComboBox<String>();
		JButton save = new JButton("Save");
		bottomPanel.add(mementosList);
		bottomPanel.add(save);

		frame.add(bottomPanel, BorderLayout.SOUTH);

		// Pattern usage...

		Caretaker caretaker = new Caretaker();
		save.addActionListener(e -> {
			caretaker.add(originator.save());
			mementosList.addItem(caretaker.getHistoryList().size() + "");
			mementosList.setSelectedItem(caretaker.getHistoryList().size() + "");
			originator.requestFocusInWindow();
		});

		mementosList.addItemListener(e -> {
			originator.restore((TextAreaMemento) caretaker.get(mementosList.getSelectedIndex()));
			originator.requestFocusInWindow();
		});

		next.addActionListener(e -> {
			if (mementosList.getSelectedIndex() < mementosList.getItemCount() - 1) {
				int nextItem = mementosList.getSelectedIndex() + 1;
				originator.restore((TextAreaMemento) caretaker.get(nextItem));
				mementosList.setSelectedIndex(nextItem);
				originator.requestFocusInWindow();
			}
		});

		previous.addActionListener(e -> {
			if (mementosList.getSelectedIndex() > 0) {
				int previousItem = mementosList.getSelectedIndex() - 1;
				originator.restore((TextAreaMemento) caretaker.get(previousItem));
				mementosList.setSelectedIndex(previousItem);
				originator.requestFocusInWindow();
			}
		});

		frame.setSize(400, 200);
		frame.setVisible(true);
	}
}