<ul>
{
for $x in doc("catalog.xml")/catalog/cd/title
order by $x
return <li>{$x}</li>
}
</ul>