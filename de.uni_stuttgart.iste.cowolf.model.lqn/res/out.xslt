<?xml version="1.0"?>
<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
	<xsl:output method="html" encoding="UTF-8" indent="no" />

	<xsl:template match="/">
		<h1>LQNSolver Analysis Results</h1>
		
		<h3>Processor Statistics</h3>
		<table>
			<thead>
				<tr>
					<th>Processor</th>
					<th>Utilization</th>
				</tr>
			</thead>
			<tbody>
				<xsl:apply-templates select="lqn-model/processor" />
			</tbody>
		</table>
	
		<h3>Task Statistics</h3>
		<table>
			<thead>
				<tr>
					<th>Task</th>
					<th>Throughput</th>
					<th>Processor's Utilization</th>
				</tr>
			</thead>
			<tbody>
				<xsl:apply-templates select="lqn-model/*/task" />
			</tbody>
		</table>
	
		<h3>Entry Statistics</h3>
		<table>
			<thead>
				<tr>
					<th>Entry</th>
					<th>Throughput</th>
					<th>Processor's Utilization</th>
				</tr>
			</thead>
			<tbody>
				<xsl:apply-templates select="lqn-model/*/*/entry" />
			</tbody>
		</table>
	
		<h3>Activity Statistics</h3>
		<table>
			<thead>
				<tr>
					<th>Activity</th>
					<th>Service Time</th>
					<th>Service Time Variance</th>
				</tr>
			</thead>
			<tbody>
				<xsl:apply-templates select="lqn-model/*/*/*/*/activity" />
			</tbody>
		</table>
				
	</xsl:template>

	<xsl:template match="processor">
		<tr>
			<td>
				<xsl:value-of select="@name" />
			</td>
			<td>
				<xsl:value-of select="result-processor/@utilization" />
			</td>
		</tr>
	</xsl:template>

	<xsl:template match="task">
		<tr>
			<td>
				<xsl:value-of select="@name" />
			</td>
			<td>
				<xsl:value-of select="result-task/@throughput" />
			</td>
			<td>
				<xsl:value-of select="result-task/@proc-utilization" />
			</td>
		</tr>
	</xsl:template>

	<xsl:template match="entry">
		<tr>
			<td>
				<xsl:value-of select="@name" />
			</td>
			<td>
				<xsl:value-of select="result-entry/@throughput" />
			</td>
			<td>
				<xsl:value-of select="result-entry/@proc-utilization" />
			</td>
		</tr>
	</xsl:template>

	<xsl:template match="activity">
		<tr>
			<td>
				<xsl:value-of select="@name" />
			</td>
			<td>
				<xsl:value-of select="result-activity/@service-time" />
			</td>
			<td>
				<xsl:value-of select="result-activity/@service-time-variance" />
			</td>
		</tr>
	</xsl:template>

</xsl:stylesheet>