# Calculadora-GUI
Interfaz gráfica de usuario para la calculadora desarrollada anteriormente
<br>
David Ramírez Arco

<!-- (This is an HTML comment). Copy and paste this entire HTML `<style>...</style>` element (block)
to the top of your markdown file -->
<style>
/* (This is a CSS comment). The below `img` style sets the default CSS styling for all images
hereafter in this markdown file. */
img
{
    /* Default display value is `inline-block`. Set it to `block` to prevent surrounding text from
    wrapping around the image. Instead, `block` format will force the text to be above or below the
    image, but never to the sides. */
    display:block;
    /* Common float options are `left`, `right`, and `none`. Set to `none` to override any previous
    settings which might have been `left` or `right`. `left` causes the image to be to the left,
    with text wrapped to the right of the image, and `right` causes the image to be to the right,
    with text wrapped to its left, so long as `display:inline-block` is also used. */
    float:none;
    /* Set both the left and right margins to `auto` to cause the image to be centered. */
    margin-left:auto;
    margin-right:auto;
    /* You may also set the size of the image, in percent of width of the screen on which the image
    is being viewed, for example. A good starting point is 60%. It will auto-scale and auto-size
    the image no matter what screen or device it is being viewed on, maintaining proporptions and
    not distorting it. */
    width:60%;
    /* You may optionally force a fixed size, or intentionally skew/distort an image by also
    setting the height. Values for `width` and `height` are commonly set in either percent (%)
    or pixels (px). Ex: `width:100%;` or `height:600px;`. */
    /* height:400px; */
}
</style>

![Imagen de la calculadora](Imagen_de_la_calculadora.bmp#center)



## Calculadora básica
&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; Ejemplos

- Suma (+)                          &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 2+3 &nbsp; `=`
- Resta (-)                         &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 6-5 &nbsp; `=`
- Multiplicación (*)              &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;  &nbsp; 4 * 6 &nbsp; `=`
- División (/)                      &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 8/4 &nbsp; `=`
- Factorial (!)                     &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 5! &nbsp; `=`
- Comprobación de número primo (P?) &nbsp; &nbsp; &nbsp; 89 &nbsp; `P?`

## Características:
- No se puede poner un "." sin nada en pantalla
- Después de pulsar "." en el mismo no será posible introducir más (Para los siguientes operandos sí)
- Pulsar una operación después de otra operación sustitulle la operación anterior, salvo si se usa la operación resta para indicar que el segundo valor introducido se trata de un número negativo.



###### Versión Java: &nbsp; &nbsp; &nbsp;  JDK 13