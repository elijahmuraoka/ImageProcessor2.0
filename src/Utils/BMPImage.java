package Utils;

/**
 * A BMP image file representation.
 */
public class BMPImage extends AbstractImageFile {
  /**
   * The abstract image file constructor used to create an Image File object and store its
   * file name.
   *
   * @param fileName the (desired) name of the file
   */
  public BMPImage(String fileName) {
    super(fileName);
  }

  @Override
  public String generateFileName(String saveAsName, String imagePath) {
    return imagePath + "/" + saveAsName + ".bmp";
  }
}
