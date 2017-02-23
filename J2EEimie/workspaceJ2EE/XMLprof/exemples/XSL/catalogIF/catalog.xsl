<?xml version="1.0" encoding="ISO-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
  <html>
  <body>
    <h2>My CD Collection</h2>
    <table border="1">
      <tr bgcolor="#9acd32">
        <th>Title</th>
        <th>Artist</th>
	<th> prix </th>
	<th> attribut </th>
      </tr>
      <xsl:for-each select="catalog/cd">
        <tr>
          <td><xsl:value-of select="title"/></td>
          <td><xsl:value-of select="artist"/></td>
	  <xsl:if test="price &gt; 10">
		<td> ++ </td>
	  </xsl:if>
	  <xsl:if test="price &lt; 10">
		<td> -- </td>
	  </xsl:if>
	  <xsl:if test="count(title/@bidon) != 0 ">
		<td> <xsl:value-of select="title/@bidon"/>  </td>
	  </xsl:if>
	  <xsl:if test="count(title/@bidon) = 0 ">
		<td> - </td>
	  </xsl:if>
        </tr>
      </xsl:for-each>
    </table>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>