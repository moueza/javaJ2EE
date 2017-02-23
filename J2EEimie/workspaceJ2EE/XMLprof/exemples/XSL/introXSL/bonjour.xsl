<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
	<html><head><titre>Salut XML</titre></head>
	<body>
	<h1>
		<xsl:value-of select="document/question"/>
	</h1>
	<h2>
		<xsl:value-of select="document/sortie"/>
	</h2>
	</body>
	</html>
</xsl:template>
</xsl:stylesheet>
