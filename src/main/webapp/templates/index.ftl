<#include "base.ftl">


<#macro page_body>
<#if loginfailed??>
    <div class="alert alert-danger" role="alert">Loginkennung order Passwort ist falsch.</div>
<#else>
    <div class="container">
        <div class="page-header">
            <img src="../images/GameOfThronesLogo.png" class="img-rounded">
        </div>
        <h4>Datenbank von Game Of Thrones</h4>
        <p>
            <a href="https://de.wikipedia.org/wiki/Game_of_Thrones">GOT</a>
            ist eine US-amerikanische Fernsehenserie, die 2011 beim HBO im Fersehen ausgestrahlt wurde. Die aktuelle
            Staffel lautet Staffel 6, die schon zu Ende gewesen ist, ferner 10 Episoden je Staffel.
        </p>
    </div>
</#if>
    <#--<div class="panel panel-default">-->
        <#--<div class="panel-heading">Playlisten</div>-->
        <#--<div class="panel-body">-->
            <#--<#if playlisten??>-->
                <#--<ul>-->
                    <#--<#list playlisten as p>-->
                        <#--<li>Playliste ${p.id}</li>-->
                    <#--</#list>-->
                <#--</ul>-->
            <#--</#if>-->
            <#--<button class="btn btn-default" type="button">Neue Playlist</button>-->
        <#--</div>-->
    <#--</div>-->
</#macro>
<@dispaly_page/>