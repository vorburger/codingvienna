package org.codingvienna.dc6.application.facade;

import java.util.HashMap;
import java.util.Map;

import org.codingvienna.dc6.Canvas;
import org.codingvienna.dc6.Caption;
import org.codingvienna.dc6.Color;
import org.codingvienna.dc6.Corner;
import org.codingvienna.dc6.Location;
import org.codingvienna.dc6.Properties;
import org.codingvienna.dc6.Size;
import org.codingvienna.dc6.Square;
import org.codingvienna.dc6.application.MainApplication;

import com.vaadin.ui.AbsoluteLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.themes.Reindeer;

public class Painter {

	private MainApplication.AppAreaWindow window;
	private static final Painter instance = new Painter();
	private Map<Square, AbsoluteLayout> map = new HashMap<Square, AbsoluteLayout>();

	public static Painter getInstance() {
		return instance;
	}

	public void setWindow(MainApplication.AppAreaWindow window) {
		this.window = window;
	}

	/**
	 * Is called to created a new canvas
	 * 
	 * @param canvas
	 * @return
	 */
	public void createCanvas(Canvas canvas) {
		if (window == null) {
			return;
		}
		AbsoluteLayout content = new AbsoluteLayout();
		content.setSizeFull();
		content.setMargin(true);
		content.addStyleName("canvas");
		window.setContent(content);

		for (Square square : canvas.getSquares()) {
			addSquare(square);
		}

	}

	/**
	 * Is called to created a new container
	 * 
	 * @param parent
	 * @return
	 */
	private void addSquare(Square square) {
		AbsoluteLayout parent = getParent(square);

		AbsoluteLayout layout = new AbsoluteLayout();
		layout.addStyleName("square");
		layout.addStyleName("red");
		layout.setWidth("50px");
		layout.setHeight("50px");

		map.put(square, layout);

		String position = String.format("top:%spx;left:%spx", "10", "10");
		parent.addComponent(layout, position);

		if (square == null) {
			return;
		}

		for (Properties prop : square.getProperties()) {
			if (prop instanceof Color) {
				applyColor((Color) prop, square);
			} else if (prop instanceof Corner) {
				applyCorner((Corner) prop, square);
			} else if (prop instanceof Location) {
				applyLocation((Location) prop, square);
			} else if (prop instanceof Size) {
				applySize((Size) prop, square);
			} else if (prop instanceof Caption) {
				applyCaption((Caption) prop, square);
			}
		}

		for (Square subSquare : square.getSquares()) {
			addSquare(subSquare);
		}
	}

	/**
	 * Is called to reset the ui.
	 * 
	 * @param square
	 * @return
	 */
	public void reset() {
		map.clear();
		AbsoluteLayout content = new AbsoluteLayout();
		content.setSizeFull();
		content.setMargin(true);
		window.setContent(content);
	}

	/**
	 * Returns the parent
	 * 
	 * @param square
	 * @return
	 */
	private AbsoluteLayout getParent(Square square) {
		Object parent = square.eContainer();
		// given square is sub square
		if (parent instanceof Square) {
			AbsoluteLayout layout = getLayout((Square) parent);
			return layout;
		} else {
			return (AbsoluteLayout) window.getContent();
		}
	}

	/**
	 * Is called to set the color.
	 * 
	 * @param prop
	 */
	private void applyColor(Color prop, Square square) {
		AbsoluteLayout layout = getLayout(square);

		layout.removeStyleName("red");
		layout.removeStyleName("blue");
		layout.removeStyleName("green");

		switch (prop.getColor()) {
		case RED:
			layout.addStyleName("red");
			break;
		case BLUE:
			layout.addStyleName("blue");
			break;
		case GREEN:
			layout.addStyleName("green");
			break;
		}
	}

	/**
	 * Is called to set the corner property.
	 * 
	 * @param prop
	 * @param layout
	 */
	private void applyCorner(Corner prop, Square square) {
		AbsoluteLayout layout = getLayout(square);

		layout.removeStyleName("corner_default");
		layout.removeStyleName("corner_rounded");

		switch (prop.getCorner()) {
		case DEFAULT:
			layout.addStyleName("corner_default");
			break;
		case ROUNDED:
			layout.addStyleName("corner_rounded");
			break;
		}
	}

	/**
	 * Is called to set the location.
	 * 
	 * @param prop
	 */
	private void applyLocation(Location prop, Square square) {
		AbsoluteLayout layout = getLayout(square);

		AbsoluteLayout parent = (AbsoluteLayout) layout.getParent();
		if (parent == null) {
			return;
		}
		parent.removeComponent(layout);

		String position = String.format("top:%spx;left:%spx",
				Integer.toString(prop.getY()), Integer.toString(prop.getX()));
		parent.addComponent(layout, position);
	}

	/**
	 * Is called to set the size.
	 * 
	 * @param prop
	 */
	private void applySize(Size prop, Square square) {
		AbsoluteLayout layout = getLayout(square);
		layout.setWidth(String.format("%spx", Integer.toString(prop.getWidth())));
		layout.setHeight(String.format("%spx",
				Integer.toString(prop.getHeight())));
	}

	/**
	 * Is called to set the size.
	 * 
	 * @param prop
	 */
	private void applyCaption(Caption prop, Square square) {
		AbsoluteLayout layout = getLayout(square);

		layout.removeAllComponents();
		Label l = new Label();
		l.addStyleName(Reindeer.LABEL_H2);
		l.addStyleName("square-caption");
		l.setSizeFull();
		l.setContentMode(Label.CONTENT_XHTML);
		l.setValue(prop.getCaption());
		layout.addComponent(l);
	}

	private AbsoluteLayout getLayout(Square square) {
		return map.get(square);
	}
}
