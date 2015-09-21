<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="html" />
	<!-- all of the rules that are defined in this xsl template will match the 
		entire xml doc -->
	<xsl:template match="/">
		<html>
			<head>
				<title>TV Shows
				</title>
			</head>
			<body>
				Version:
				<xsl:value-of select="system-property('xsl:version')"></xsl:value-of>
				<br />
				Vendor:
				<xsl:value-of select="system-property('xsl:vendor')"></xsl:value-of>
				<br />
				Vendor URL:
				<xsl:value-of select="system-property('xsl:vendor-url')"></xsl:value-of>
				<br />


				<xsl:for-each select="tvshow/show">

					<a href="#{generate-id(name)}">
						<xsl:value-of select="name"></xsl:value-of>
					</a>
					<br />

				</xsl:for-each>

				<xsl:for-each select="tvshow/show">

					<xsl:sort select="name" order="ascending" data-type="text"></xsl:sort>
					<h3>
						<a name="{generate-id(name)}">
							<xsl:value-of select="name"></xsl:value-of>
						</a>
					</h3>

					<img>
						<xsl:attribute name="src">
							<xsl:value-of select="poster/@href"></xsl:value-of>
						</xsl:attribute>
					</img>
					<br />

					<xsl:value-of select="current()"></xsl:value-of>
					<br />

					<p>
						The show
						<xsl:value-of select="name" />
						was released in
						<xsl:value-of select="release" />
						by
						<xsl:value-of select="network" />
						. It had an average viewership of
						<xsl:value-of select="viewers" />
						million people. It was cancelled in
						<xsl:value-of select="end_date" />
						.
					</p>
					<br />

				</xsl:for-each>


				<table border="2">
					<tr>
						<th>Name</th>
						<th>Network</th>
						<th>Viewers</th>
					</tr>

					<xsl:for-each select="tvshow/show">
						<xsl:if test="release &lt; 2006">
							<tr>
								<td>
									<xsl:value-of select="name" />
								</td>
								<td>
									<xsl:value-of select="network" />
								</td>
								<td>
									<xsl:value-of select="viewers" />
								</td>
							</tr>
						</xsl:if>

						<!-- This is like the Switch Block -->
						<xsl:choose>

							<xsl:when test="release > 2006">
								<tr bgclor="yellow">
									<td>
										<xsl:value-of select="name" />
									</td>
									<td>
										<xsl:value-of select="network" />
									</td>
									<td>
										<xsl:value-of select="viewers" />
									</td>
								</tr>

							</xsl:when>
							<xsl:when test="release = 2006">
								<tr bgclor="orange">
									<td>
										<xsl:value-of select="name" />
									</td>
									<td>
										<xsl:value-of select="network" />
									</td>
									<td>
										<xsl:value-of select="viewers" />
									</td>
								</tr>

							</xsl:when>
							<!-- This is the Default block in the Switch Block -->
							<xsl:otherwise>
								<tr bgclor="pink">
									<td>
										<xsl:value-of select="name" />
									</td>
									<td>
										<xsl:value-of select="network" />
									</td>
									<td>
										<xsl:value-of select="viewers" />
									</td>
								</tr>

							</xsl:otherwise>

						</xsl:choose>

					</xsl:for-each>

				</table>


			</body>
		</html>

	</xsl:template>
</xsl:stylesheet>