package org.jfree.chart.annotations;

import org.jfree.chart.api.RectangleEdge;
import org.jfree.chart.axis.AxisState;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.PlotRenderingInfo;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.Range;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.*;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class XYDataImageAnnotationTest {

    private XYDataImageAnnotation xyDataImageAnnotation;
    private Image defaultImage;
    private double defaultValue;

    private Graphics2D g2;
    private XYPlot plot;
    private Rectangle2D rectangle2D;
    private ValueAxis domainAxis;
    private ValueAxis rangeAxis;

    @BeforeEach
    void setUp() {
        defaultImage = getDefaultImage();
        defaultValue = 1.0;

        xyDataImageAnnotation = new XYDataImageAnnotation(
                defaultImage, defaultValue, defaultValue, defaultValue, defaultValue
        );

        g2 = getGraphics2D();
        plot = new XYPlot();
        rectangle2D = getRectangle2D();
        domainAxis = getValueAxis("testDomainAxis");
        rangeAxis = getValueAxis("testRangeAxis");
    }

    private static ValueAxis getValueAxis(String label) {
        return new ValueAxis(label, null) {
            @Override
            public double valueToJava2D(double value, Rectangle2D area, RectangleEdge edge) {
                return 0;
            }

            @Override
            public double java2DToValue(double java2DValue, Rectangle2D area, RectangleEdge edge) {
                return 0;
            }

            @Override
            protected void autoAdjustRange() {

            }

            @Override
            public void configure() {

            }

            @Override
            public AxisState draw(Graphics2D g2, double cursor, Rectangle2D plotArea, Rectangle2D dataArea, RectangleEdge edge, PlotRenderingInfo plotState) {
                return null;
            }

            @Override
            public List refreshTicks(Graphics2D g2, AxisState state, Rectangle2D dataArea, RectangleEdge edge) {
                return null;
            }
        };
    }

    private static Rectangle2D getRectangle2D() {
        return new Rectangle2D() {
            @Override
            public void setRect(double x, double y, double w, double h) {

            }

            @Override
            public int outcode(double x, double y) {
                return 0;
            }

            @Override
            public Rectangle2D createIntersection(Rectangle2D r) {
                return null;
            }

            @Override
            public Rectangle2D createUnion(Rectangle2D r) {
                return null;
            }

            @Override
            public double getX() {
                return 0;
            }

            @Override
            public double getY() {
                return 0;
            }

            @Override
            public double getWidth() {
                return 0;
            }

            @Override
            public double getHeight() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }
        };
    }

    private static Graphics2D getGraphics2D() {
        return new Graphics2D() {
            @Override
            public void draw(Shape s) {

            }

            @Override
            public boolean drawImage(Image img, AffineTransform xform, ImageObserver obs) {
                return false;
            }

            @Override
            public void drawImage(BufferedImage img, BufferedImageOp op, int x, int y) {

            }

            @Override
            public void drawRenderedImage(RenderedImage img, AffineTransform xform) {

            }

            @Override
            public void drawRenderableImage(RenderableImage img, AffineTransform xform) {

            }

            @Override
            public void drawString(String str, int x, int y) {

            }

            @Override
            public void drawString(String str, float x, float y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, int x, int y) {

            }

            @Override
            public void drawString(AttributedCharacterIterator iterator, float x, float y) {

            }

            @Override
            public void drawGlyphVector(GlyphVector g, float x, float y) {

            }

            @Override
            public void fill(Shape s) {

            }

            @Override
            public boolean hit(Rectangle rect, Shape s, boolean onStroke) {
                return false;
            }

            @Override
            public GraphicsConfiguration getDeviceConfiguration() {
                return null;
            }

            @Override
            public void setComposite(Composite comp) {

            }

            @Override
            public void setPaint(Paint paint) {

            }

            @Override
            public void setStroke(Stroke s) {

            }

            @Override
            public void setRenderingHint(RenderingHints.Key hintKey, Object hintValue) {

            }

            @Override
            public Object getRenderingHint(RenderingHints.Key hintKey) {
                return null;
            }

            @Override
            public void setRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public void addRenderingHints(Map<?, ?> hints) {

            }

            @Override
            public RenderingHints getRenderingHints() {
                return null;
            }

            @Override
            public void translate(int x, int y) {

            }

            @Override
            public void translate(double tx, double ty) {

            }

            @Override
            public void rotate(double theta) {

            }

            @Override
            public void rotate(double theta, double x, double y) {

            }

            @Override
            public void scale(double sx, double sy) {

            }

            @Override
            public void shear(double shx, double shy) {

            }

            @Override
            public void transform(AffineTransform Tx) {

            }

            @Override
            public void setTransform(AffineTransform Tx) {

            }

            @Override
            public AffineTransform getTransform() {
                return null;
            }

            @Override
            public Paint getPaint() {
                return null;
            }

            @Override
            public Composite getComposite() {
                return null;
            }

            @Override
            public void setBackground(Color color) {

            }

            @Override
            public Color getBackground() {
                return null;
            }

            @Override
            public Stroke getStroke() {
                return null;
            }

            @Override
            public void clip(Shape s) {

            }

            @Override
            public FontRenderContext getFontRenderContext() {
                return null;
            }

            @Override
            public Graphics create() {
                return null;
            }

            @Override
            public Color getColor() {
                return null;
            }

            @Override
            public void setColor(Color c) {

            }

            @Override
            public void setPaintMode() {

            }

            @Override
            public void setXORMode(Color c1) {

            }

            @Override
            public Font getFont() {
                return null;
            }

            @Override
            public void setFont(Font font) {

            }

            @Override
            public FontMetrics getFontMetrics(Font f) {
                return null;
            }

            @Override
            public Rectangle getClipBounds() {
                return null;
            }

            @Override
            public void clipRect(int x, int y, int width, int height) {

            }

            @Override
            public void setClip(int x, int y, int width, int height) {

            }

            @Override
            public Shape getClip() {
                return null;
            }

            @Override
            public void setClip(Shape clip) {

            }

            @Override
            public void copyArea(int x, int y, int width, int height, int dx, int dy) {

            }

            @Override
            public void drawLine(int x1, int y1, int x2, int y2) {

            }

            @Override
            public void fillRect(int x, int y, int width, int height) {

            }

            @Override
            public void clearRect(int x, int y, int width, int height) {

            }

            @Override
            public void drawRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {

            }

            @Override
            public void drawOval(int x, int y, int width, int height) {

            }

            @Override
            public void fillOval(int x, int y, int width, int height) {

            }

            @Override
            public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

            }

            @Override
            public void drawPolyline(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void drawPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public void fillPolygon(int[] xPoints, int[] yPoints, int nPoints) {

            }

            @Override
            public boolean drawImage(Image img, int x, int y, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int x, int y, int width, int height, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, ImageObserver observer) {
                return false;
            }

            @Override
            public boolean drawImage(Image img, int dx1, int dy1, int dx2, int dy2, int sx1, int sy1, int sx2, int sy2, Color bgcolor, ImageObserver observer) {
                return false;
            }

            @Override
            public void dispose() {

            }
        };
    }

    private static Image getDefaultImage() {
        return new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 1;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 1;
            }

            @Override
            public ImageProducer getSource() {
                return null;
            }

            @Override
            public Graphics getGraphics() {
                return null;
            }

            @Override
            public Object getProperty(String name, ImageObserver observer) {
                return null;
            }
        };
    }

    @Test
    void throwExceptionWhenImageIsNull() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new XYDataImageAnnotation(
                        null, Double.NaN, Double.NaN, Double.NaN, Double.NaN
                )
        );
    }

    @Test
    void canConstruct() {
        double x = defaultValue;
        double y = defaultValue;
        double h = defaultValue;
        double w = defaultValue;

        Range xRange = new Range(x, x + w);
        Range yRange = new Range(y, x + h);
        XYDataImageAnnotation xy = new XYDataImageAnnotation(
                defaultImage, x, y, w, h
        );

        assertNotNull(xy);
        assertNotNull(xy.getImage());
        assertFalse(xy.getIncludeInDataBounds());
        assertEquals(defaultValue, xy.getX());
        assertEquals(defaultValue, xy.getY());
        assertEquals(defaultValue, xy.getWidth());
        assertEquals(defaultValue, xy.getHeight());
        assertEquals(xRange, xy.getXRange());
        assertEquals(yRange, xy.getYRange());
    }

    @Test
    void testEquals() {
        AbstractXYAnnotation xy2 = new AbstractXYAnnotation(
        ) {
            @Override
            public void draw(Graphics2D g2, XYPlot plot, Rectangle2D dataArea, ValueAxis domainAxis, ValueAxis rangeAxis, int rendererIndex, PlotRenderingInfo info) {

            }
        };

        XYDataImageAnnotation xyWithDifferentX = new XYDataImageAnnotation(
                defaultImage, defaultValue + 1, defaultValue, defaultValue, defaultValue
        );

        XYDataImageAnnotation xyWithDifferentY = new XYDataImageAnnotation(
                defaultImage, defaultValue, defaultValue + 1, defaultValue, defaultValue
        );

        XYDataImageAnnotation xyWithDifferentW = new XYDataImageAnnotation(
                defaultImage, defaultValue, defaultValue, defaultValue + 1, defaultValue
        );

        XYDataImageAnnotation xyWithDifferentH = new XYDataImageAnnotation(
                defaultImage, defaultValue, defaultValue, defaultValue, defaultValue + 1
        );

        Image differentImage = getDefaultImage();
        differentImage.setAccelerationPriority(0.9f);

        XYDataImageAnnotation xyWithDifferentImage = new XYDataImageAnnotation(
                differentImage, defaultValue, defaultValue, defaultValue, defaultValue
        );

        XYDataImageAnnotation xyDifferentInstance = new XYDataImageAnnotation(
                defaultImage, defaultValue, defaultValue, defaultValue, defaultValue
        );

        assertEquals(xyDataImageAnnotation, xyDataImageAnnotation);
        assertNotEquals(xyDataImageAnnotation, xy2);
        assertNotEquals(xyDataImageAnnotation, xyWithDifferentX);
        assertNotEquals(xyDataImageAnnotation, xyWithDifferentY);
        assertNotEquals(xyDataImageAnnotation, xyWithDifferentW);
        assertNotEquals(xyDataImageAnnotation, xyWithDifferentH);
        assertNotEquals(xyDataImageAnnotation, xyWithDifferentImage);
        assertEquals(xyDataImageAnnotation, xyDifferentInstance);
    }

    @Test
    void testImageHashcode() {
        assertEquals(defaultImage.hashCode(), xyDataImageAnnotation.hashCode());
    }

    @Test
    void testClone() throws CloneNotSupportedException {
        Object xyCloned = xyDataImageAnnotation.clone();

        assertTrue(xyCloned instanceof XYDataImageAnnotation);
    }

    @Test
    void draw_throwExceptionWhenInvalidInputs() {
        assertThrows(NullPointerException.class,
                () -> xyDataImageAnnotation.draw(
                        null, null, null,
                        null, null,
                        0,
                        null));

        assertThrows(
                NullPointerException.class,
                () -> xyDataImageAnnotation.draw(
                        g2, null, null,
                        null, null,
                        0, null));

        assertThrows(
                NullPointerException.class,
                () -> xyDataImageAnnotation.draw(
                        g2, plot, rectangle2D,
                        null, null,
                        0,
                        null)
        );

        assertThrows(
                NullPointerException.class,
                () -> xyDataImageAnnotation.draw(
                        g2, plot, rectangle2D,
                        domainAxis, null,
                        0,
                        null)
        );
    }

    @Test
    void canDraw() {
        xyDataImageAnnotation.draw(
                g2, plot, rectangle2D,
                domainAxis, rangeAxis,
                0,
                null
        );
    }

    @Test
    void canDrawWithHorizontalOrientation() {
        plot.setOrientation(PlotOrientation.HORIZONTAL);
        xyDataImageAnnotation.draw(
                g2, plot, rectangle2D,
                domainAxis, rangeAxis,
                0,
                null
        );
    }

    @Test
    void canDrawWithTooltip() {
        xyDataImageAnnotation.setToolTipText("testTooltip");
        xyDataImageAnnotation.draw(
                g2, plot, rectangle2D,
                domainAxis, rangeAxis,
                0,
                null
        );
    }
}
