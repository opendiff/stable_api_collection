#
# Stability.ai REST API
# Welcome to the Stability.ai REST API developer preview!  Please note, this is an alpha version of our new REST API, and is subject to change according to your feedback.  Feedback during this test is crucial for us to understand what the pain points are and how we can improve it going forward.  Changes will be communicated here, as well as on our online REST API documentation, which can be found at: https://api.stability.ai/docs  Your DreamStudio API key will be required for authentication. You can learn more about API keys here: https://platform.stability.ai/docs/getting-started/authentication  If you encounter any issues, please let us know in the #API discord channel: https://discord.gg/stablediffusion 
# Version: 0.1
# Contact: info@stability.ai
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

function Get-FunctionsToExport {
    [CmdletBinding()]
    Param (
        [Parameter(Mandatory = $true, ValueFromPipelineByPropertyName = $true)]
        [ValidateNotNullOrEmpty()]
        [Alias('FullName')]
        $Path
    )

    Process {
        $Token = $null
        $ParserErr = $null

        $Ast = [System.Management.Automation.Language.Parser]::ParseFile(
            $Path,
            [ref]$Token,
            [ref]$ParserErr
        )

        if ($ParserErr) {
            throw $ParserErr
        } else {
            foreach ($name in 'Begin', 'Process', 'End') {
                foreach ($Statement in $Ast."${name}Block".Statements) {
                    if (
                        [String]::IsNullOrWhiteSpace($Statement.Name) -or
                        $Statement.Extent.ToString() -notmatch
                        ('function\W+{0}' -f $Statement.Name)
                    ) {
                        continue
                    }

                    $Statement.Name
                }
            }
        }
    }
}

$ScriptDir = Split-Path $script:MyInvocation.MyCommand.Path
$FunctionPath = 'Api', 'Model', 'Client' | ForEach-Object {Join-Path "$ScriptDir\src\PSOpenAPITools\" $_}

$Manifest = @{
    Path = "$ScriptDir\src\PSOpenAPITools\PSOpenAPITools.psd1"

    Author = 'OpenAPI Generator Team'
    CompanyName = 'openapitools.org'
    Description = 'PSOpenAPITools - the PowerShell module for Stability.ai REST API'

    ModuleVersion = '0.1.2'

    RootModule = 'PSOpenAPITools.psm1'
    Guid = '{50E7401B-A3EE-436D-9609-442A64F637A0}' # Has to be static, otherwise each new build will be considered different module

    PowerShellVersion = '6.2'

    FunctionsToExport = $FunctionPath | Get-ChildItem -Filter *.ps1 | Get-FunctionsToExport

    VariablesToExport = @()
    AliasesToExport = @()
    CmdletsToExport = @()

}

New-ModuleManifest @Manifest