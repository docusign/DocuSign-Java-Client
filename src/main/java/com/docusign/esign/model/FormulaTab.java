package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.LocalePolicyTab;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PaymentDetails;
import com.docusign.esign.model.PropertyMetadata;
import com.docusign.esign.model.SmartContractInformation;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * The value of a formula tab is calculated from the values of other number or
 * date tabs in the document. When the recipient completes the underlying
 * fields, the formula tab calculates and displays the result. The
 * &#x60;formula&#x60; property of the tab contains the references to the
 * underlying tabs. See [Calculated Fields][calculatedfields] in the DocuSign
 * Support Center to learn more about formulas. If a formula tab contains a
 * &#x60;paymentDetails&#x60; property, the tab is considered a payment item.
 * See [Requesting Payments Along with Signatures][paymentguide] in the DocuSign
 * Support Center to learn more about payments. [calculatedfields]:
 * https://support.docusign.com/en/guides/ndse-user-guide-calculated-fields
 * [paymentguide]:
 * https://support.docusign.com/en/guides/requesting-payments-along-with-signatures
 * .
 *
 */
@Schema(description = "The description of a formula tab is calculated from the values of other number or date tabs in the document. When the recipient completes the underlying fields, the formula tab calculates and displays the result.  The `formula` property of the tab contains the references to the underlying tabs. See [Calculated Fields][calculatedfields] in the DocuSign Support Center to learn more about formulas.  If a formula tab contains a `paymentDetails` property, the tab is considered a payment item. See [Requesting Payments Along with Signatures][paymentguide] in the DocuSign Support Center to learn more about payments.  [calculatedfields]: https://support.docusign.com/en/guides/ndse-user-guide-calculated-fields [paymentguide]:     https://support.docusign.com/en/guides/requesting-payments-along-with-signatures ")

public class FormulaTab {
  @JsonProperty("anchorAllowWhiteSpaceInCharacters")
  private String anchorAllowWhiteSpaceInCharacters = null;

  @JsonProperty("anchorAllowWhiteSpaceInCharactersMetadata")
  private PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata = null;

  @JsonProperty("anchorCaseSensitive")
  private String anchorCaseSensitive = null;

  @JsonProperty("anchorCaseSensitiveMetadata")
  private PropertyMetadata anchorCaseSensitiveMetadata = null;

  @JsonProperty("anchorHorizontalAlignment")
  private String anchorHorizontalAlignment = null;

  @JsonProperty("anchorHorizontalAlignmentMetadata")
  private PropertyMetadata anchorHorizontalAlignmentMetadata = null;

  @JsonProperty("anchorIgnoreIfNotPresent")
  private String anchorIgnoreIfNotPresent = null;

  @JsonProperty("anchorIgnoreIfNotPresentMetadata")
  private PropertyMetadata anchorIgnoreIfNotPresentMetadata = null;

  @JsonProperty("anchorMatchWholeWord")
  private String anchorMatchWholeWord = null;

  @JsonProperty("anchorMatchWholeWordMetadata")
  private PropertyMetadata anchorMatchWholeWordMetadata = null;

  @JsonProperty("anchorString")
  private String anchorString = null;

  @JsonProperty("anchorStringMetadata")
  private PropertyMetadata anchorStringMetadata = null;

  @JsonProperty("anchorTabProcessorVersion")
  private String anchorTabProcessorVersion = null;

  @JsonProperty("anchorTabProcessorVersionMetadata")
  private PropertyMetadata anchorTabProcessorVersionMetadata = null;

  @JsonProperty("anchorUnits")
  private String anchorUnits = null;

  @JsonProperty("anchorUnitsMetadata")
  private PropertyMetadata anchorUnitsMetadata = null;

  @JsonProperty("anchorXOffset")
  private String anchorXOffset = null;

  @JsonProperty("anchorXOffsetMetadata")
  private PropertyMetadata anchorXOffsetMetadata = null;

  @JsonProperty("anchorYOffset")
  private String anchorYOffset = null;

  @JsonProperty("anchorYOffsetMetadata")
  private PropertyMetadata anchorYOffsetMetadata = null;

  @JsonProperty("bold")
  private String bold = null;

  @JsonProperty("boldMetadata")
  private PropertyMetadata boldMetadata = null;

  @JsonProperty("caption")
  private String caption = null;

  @JsonProperty("captionMetadata")
  private PropertyMetadata captionMetadata = null;

  @JsonProperty("concealValueOnDocument")
  private String concealValueOnDocument = null;

  @JsonProperty("concealValueOnDocumentMetadata")
  private PropertyMetadata concealValueOnDocumentMetadata = null;

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentLabelMetadata")
  private PropertyMetadata conditionalParentLabelMetadata = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("conditionalParentValueMetadata")
  private PropertyMetadata conditionalParentValueMetadata = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("customTabIdMetadata")
  private PropertyMetadata customTabIdMetadata = null;

  @JsonProperty("disableAutoSize")
  private String disableAutoSize = null;

  @JsonProperty("disableAutoSizeMetadata")
  private PropertyMetadata disableAutoSizeMetadata = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentIdMetadata")
  private PropertyMetadata documentIdMetadata = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("font")
  private String font = null;

  @JsonProperty("fontColor")
  private String fontColor = null;

  @JsonProperty("fontColorMetadata")
  private PropertyMetadata fontColorMetadata = null;

  @JsonProperty("fontMetadata")
  private PropertyMetadata fontMetadata = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("fontSizeMetadata")
  private PropertyMetadata fontSizeMetadata = null;

  @JsonProperty("formOrder")
  private String formOrder = null;

  @JsonProperty("formOrderMetadata")
  private PropertyMetadata formOrderMetadata = null;

  @JsonProperty("formPageLabel")
  private String formPageLabel = null;

  @JsonProperty("formPageLabelMetadata")
  private PropertyMetadata formPageLabelMetadata = null;

  @JsonProperty("formPageNumber")
  private String formPageNumber = null;

  @JsonProperty("formPageNumberMetadata")
  private PropertyMetadata formPageNumberMetadata = null;

  @JsonProperty("formula")
  private String formula = null;

  @JsonProperty("formulaMetadata")
  private PropertyMetadata formulaMetadata = null;

  @JsonProperty("height")
  private String height = null;

  @JsonProperty("heightMetadata")
  private PropertyMetadata heightMetadata = null;

  @JsonProperty("hidden")
  private String hidden = null;

  @JsonProperty("hiddenMetadata")
  private PropertyMetadata hiddenMetadata = null;

  @JsonProperty("isPaymentAmount")
  private String isPaymentAmount = null;

  @JsonProperty("isPaymentAmountMetadata")
  private PropertyMetadata isPaymentAmountMetadata = null;

  @JsonProperty("italic")
  private String italic = null;

  @JsonProperty("italicMetadata")
  private PropertyMetadata italicMetadata = null;

  @JsonProperty("localePolicy")
  private LocalePolicyTab localePolicy = null;

  @JsonProperty("locked")
  private String locked = null;

  @JsonProperty("lockedMetadata")
  private PropertyMetadata lockedMetadata = null;

  @JsonProperty("maxLength")
  private String maxLength = null;

  @JsonProperty("maxLengthMetadata")
  private PropertyMetadata maxLengthMetadata = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("mergeFieldXml")
  private String mergeFieldXml = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("nameMetadata")
  private PropertyMetadata nameMetadata = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("originalValueMetadata")
  private PropertyMetadata originalValueMetadata = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("pageNumberMetadata")
  private PropertyMetadata pageNumberMetadata = null;

  @JsonProperty("paymentDetails")
  private PaymentDetails paymentDetails = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("recipientIdGuid")
  private String recipientIdGuid = null;

  @JsonProperty("recipientIdGuidMetadata")
  private PropertyMetadata recipientIdGuidMetadata = null;

  @JsonProperty("recipientIdMetadata")
  private PropertyMetadata recipientIdMetadata = null;

  @JsonProperty("requireAll")
  private String requireAll = null;

  @JsonProperty("requireAllMetadata")
  private PropertyMetadata requireAllMetadata = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("requiredMetadata")
  private PropertyMetadata requiredMetadata = null;

  @JsonProperty("requireInitialOnSharedChange")
  private String requireInitialOnSharedChange = null;

  @JsonProperty("requireInitialOnSharedChangeMetadata")
  private PropertyMetadata requireInitialOnSharedChangeMetadata = null;

  @JsonProperty("roundDecimalPlaces")
  private String roundDecimalPlaces = null;

  @JsonProperty("roundDecimalPlacesMetadata")
  private PropertyMetadata roundDecimalPlacesMetadata = null;

  @JsonProperty("senderRequired")
  private String senderRequired = null;

  @JsonProperty("senderRequiredMetadata")
  private PropertyMetadata senderRequiredMetadata = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("sharedMetadata")
  private PropertyMetadata sharedMetadata = null;

  @JsonProperty("shareToRecipients")
  private String shareToRecipients = null;

  @JsonProperty("shareToRecipientsMetadata")
  private PropertyMetadata shareToRecipientsMetadata = null;

  @JsonProperty("smartContractInformation")
  private SmartContractInformation smartContractInformation = null;

  @JsonProperty("source")
  private String source = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("statusMetadata")
  private PropertyMetadata statusMetadata = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = null;

  @JsonProperty("tabGroupLabelsMetadata")
  private PropertyMetadata tabGroupLabelsMetadata = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabIdMetadata")
  private PropertyMetadata tabIdMetadata = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  @JsonProperty("tabLabelMetadata")
  private PropertyMetadata tabLabelMetadata = null;

  @JsonProperty("tabOrder")
  private String tabOrder = null;

  @JsonProperty("tabOrderMetadata")
  private PropertyMetadata tabOrderMetadata = null;

  @JsonProperty("tabType")
  private String tabType = null;

  @JsonProperty("tabTypeMetadata")
  private PropertyMetadata tabTypeMetadata = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateLockedMetadata")
  private PropertyMetadata templateLockedMetadata = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("templateRequiredMetadata")
  private PropertyMetadata templateRequiredMetadata = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("toolTipMetadata")
  private PropertyMetadata toolTipMetadata = null;

  @JsonProperty("underline")
  private String underline = null;

  @JsonProperty("underlineMetadata")
  private PropertyMetadata underlineMetadata = null;

  @JsonProperty("validationMessage")
  private String validationMessage = null;

  @JsonProperty("validationMessageMetadata")
  private PropertyMetadata validationMessageMetadata = null;

  @JsonProperty("validationPattern")
  private String validationPattern = null;

  @JsonProperty("validationPatternMetadata")
  private PropertyMetadata validationPatternMetadata = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("valueMetadata")
  private PropertyMetadata valueMetadata = null;

  @JsonProperty("width")
  private String width = null;

  @JsonProperty("widthMetadata")
  private PropertyMetadata widthMetadata = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("xPositionMetadata")
  private PropertyMetadata xPositionMetadata = null;

  @JsonProperty("yPosition")
  private String yPosition = null;

  @JsonProperty("yPositionMetadata")
  private PropertyMetadata yPositionMetadata = null;

  /**
   * anchorAllowWhiteSpaceInCharacters.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
    return this;
  }

  /**
   * .
   * 
   * @return anchorAllowWhiteSpaceInCharacters
   **/
  @Schema(description = "")
  public String getAnchorAllowWhiteSpaceInCharacters() {
    return anchorAllowWhiteSpaceInCharacters;
  }

  /**
   * setAnchorAllowWhiteSpaceInCharacters.
   **/
  public void setAnchorAllowWhiteSpaceInCharacters(String anchorAllowWhiteSpaceInCharacters) {
    this.anchorAllowWhiteSpaceInCharacters = anchorAllowWhiteSpaceInCharacters;
  }

  /**
   * anchorAllowWhiteSpaceInCharactersMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorAllowWhiteSpaceInCharactersMetadata(
      PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorAllowWhiteSpaceInCharacters`
   * property is editable..
   * 
   * @return anchorAllowWhiteSpaceInCharactersMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorAllowWhiteSpaceInCharacters` property is editable.")
  public PropertyMetadata getAnchorAllowWhiteSpaceInCharactersMetadata() {
    return anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /**
   * setAnchorAllowWhiteSpaceInCharactersMetadata.
   **/
  public void setAnchorAllowWhiteSpaceInCharactersMetadata(PropertyMetadata anchorAllowWhiteSpaceInCharactersMetadata) {
    this.anchorAllowWhiteSpaceInCharactersMetadata = anchorAllowWhiteSpaceInCharactersMetadata;
  }

  /**
   * anchorCaseSensitive.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

  /**
   * When set to **true**, the anchor string does not consider case when matching
   * strings in the document. The default value is **true**..
   * 
   * @return anchorCaseSensitive
   **/
  @Schema(description = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  /**
   * setAnchorCaseSensitive.
   **/
  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  /**
   * anchorCaseSensitiveMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorCaseSensitive` property is
   * editable..
   * 
   * @return anchorCaseSensitiveMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorCaseSensitive` property is editable.")
  public PropertyMetadata getAnchorCaseSensitiveMetadata() {
    return anchorCaseSensitiveMetadata;
  }

  /**
   * setAnchorCaseSensitiveMetadata.
   **/
  public void setAnchorCaseSensitiveMetadata(PropertyMetadata anchorCaseSensitiveMetadata) {
    this.anchorCaseSensitiveMetadata = anchorCaseSensitiveMetadata;
  }

  /**
   * anchorHorizontalAlignment.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

  /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values
   * are **left** or **right**. The default value is **left**..
   * 
   * @return anchorHorizontalAlignment
   **/
  @Schema(description = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  /**
   * setAnchorHorizontalAlignment.
   **/
  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  /**
   * anchorHorizontalAlignmentMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorHorizontalAlignment` property is
   * editable..
   * 
   * @return anchorHorizontalAlignmentMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorHorizontalAlignment` property is editable.")
  public PropertyMetadata getAnchorHorizontalAlignmentMetadata() {
    return anchorHorizontalAlignmentMetadata;
  }

  /**
   * setAnchorHorizontalAlignmentMetadata.
   **/
  public void setAnchorHorizontalAlignmentMetadata(PropertyMetadata anchorHorizontalAlignmentMetadata) {
    this.anchorHorizontalAlignmentMetadata = anchorHorizontalAlignmentMetadata;
  }

  /**
   * anchorIgnoreIfNotPresent.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

  /**
   * When set to **true**, this tab is ignored if anchorString is not found in the
   * document..
   * 
   * @return anchorIgnoreIfNotPresent
   **/
  @Schema(description = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  /**
   * setAnchorIgnoreIfNotPresent.
   **/
  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  /**
   * anchorIgnoreIfNotPresentMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is
   * editable..
   * 
   * @return anchorIgnoreIfNotPresentMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorIgnoreIfNotPresent` property is editable.")
  public PropertyMetadata getAnchorIgnoreIfNotPresentMetadata() {
    return anchorIgnoreIfNotPresentMetadata;
  }

  /**
   * setAnchorIgnoreIfNotPresentMetadata.
   **/
  public void setAnchorIgnoreIfNotPresentMetadata(PropertyMetadata anchorIgnoreIfNotPresentMetadata) {
    this.anchorIgnoreIfNotPresentMetadata = anchorIgnoreIfNotPresentMetadata;
  }

  /**
   * anchorMatchWholeWord.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

  /**
   * When set to **true**, the anchor string in this tab matches whole words only
   * (strings embedded in other strings are ignored.) The default value is
   * **true**..
   * 
   * @return anchorMatchWholeWord
   **/
  @Schema(description = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  /**
   * setAnchorMatchWholeWord.
   **/
  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  /**
   * anchorMatchWholeWordMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorMatchWholeWord` property is
   * editable..
   * 
   * @return anchorMatchWholeWordMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorMatchWholeWord` property is editable.")
  public PropertyMetadata getAnchorMatchWholeWordMetadata() {
    return anchorMatchWholeWordMetadata;
  }

  /**
   * setAnchorMatchWholeWordMetadata.
   **/
  public void setAnchorMatchWholeWordMetadata(PropertyMetadata anchorMatchWholeWordMetadata) {
    this.anchorMatchWholeWordMetadata = anchorMatchWholeWordMetadata;
  }

  /**
   * anchorString.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

  /**
   * Anchor text information for a radio button..
   * 
   * @return anchorString
   **/
  @Schema(description = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  /**
   * setAnchorString.
   **/
  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  /**
   * anchorStringMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorString` property is editable..
   * 
   * @return anchorStringMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorString` property is editable.")
  public PropertyMetadata getAnchorStringMetadata() {
    return anchorStringMetadata;
  }

  /**
   * setAnchorStringMetadata.
   **/
  public void setAnchorStringMetadata(PropertyMetadata anchorStringMetadata) {
    this.anchorStringMetadata = anchorStringMetadata;
  }

  /**
   * anchorTabProcessorVersion.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
    return this;
  }

  /**
   * .
   * 
   * @return anchorTabProcessorVersion
   **/
  @Schema(description = "")
  public String getAnchorTabProcessorVersion() {
    return anchorTabProcessorVersion;
  }

  /**
   * setAnchorTabProcessorVersion.
   **/
  public void setAnchorTabProcessorVersion(String anchorTabProcessorVersion) {
    this.anchorTabProcessorVersion = anchorTabProcessorVersion;
  }

  /**
   * anchorTabProcessorVersionMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return anchorTabProcessorVersionMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getAnchorTabProcessorVersionMetadata() {
    return anchorTabProcessorVersionMetadata;
  }

  /**
   * setAnchorTabProcessorVersionMetadata.
   **/
  public void setAnchorTabProcessorVersionMetadata(PropertyMetadata anchorTabProcessorVersionMetadata) {
    this.anchorTabProcessorVersionMetadata = anchorTabProcessorVersionMetadata;
  }

  /**
   * anchorUnits.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

  /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters,
   * centimeters, or inches..
   * 
   * @return anchorUnits
   **/
  @Schema(description = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  /**
   * setAnchorUnits.
   **/
  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  /**
   * anchorUnitsMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorUnits` property is editable..
   * 
   * @return anchorUnitsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorUnits` property is editable.")
  public PropertyMetadata getAnchorUnitsMetadata() {
    return anchorUnitsMetadata;
  }

  /**
   * setAnchorUnitsMetadata.
   **/
  public void setAnchorUnitsMetadata(PropertyMetadata anchorUnitsMetadata) {
    this.anchorUnitsMetadata = anchorUnitsMetadata;
  }

  /**
   * anchorXOffset.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

  /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the
   * anchorString..
   * 
   * @return anchorXOffset
   **/
  @Schema(description = "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  /**
   * setAnchorXOffset.
   **/
  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  /**
   * anchorXOffsetMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorXOffset` property is editable..
   * 
   * @return anchorXOffsetMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorXOffset` property is editable.")
  public PropertyMetadata getAnchorXOffsetMetadata() {
    return anchorXOffsetMetadata;
  }

  /**
   * setAnchorXOffsetMetadata.
   **/
  public void setAnchorXOffsetMetadata(PropertyMetadata anchorXOffsetMetadata) {
    this.anchorXOffsetMetadata = anchorXOffsetMetadata;
  }

  /**
   * anchorYOffset.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

  /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the
   * anchorString..
   * 
   * @return anchorYOffset
   **/
  @Schema(description = "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  /**
   * setAnchorYOffset.
   **/
  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  /**
   * anchorYOffsetMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab anchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `anchorYOffset` property is editable..
   * 
   * @return anchorYOffsetMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `anchorYOffset` property is editable.")
  public PropertyMetadata getAnchorYOffsetMetadata() {
    return anchorYOffsetMetadata;
  }

  /**
   * setAnchorYOffsetMetadata.
   **/
  public void setAnchorYOffsetMetadata(PropertyMetadata anchorYOffsetMetadata) {
    this.anchorYOffsetMetadata = anchorYOffsetMetadata;
  }

  /**
   * bold.
   *
   * @return FormulaTab
   **/
  public FormulaTab bold(String bold) {
    this.bold = bold;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is bold..
   * 
   * @return bold
   **/
  @Schema(description = "When set to **true**, the information in the tab is bold.")
  public String getBold() {
    return bold;
  }

  /**
   * setBold.
   **/
  public void setBold(String bold) {
    this.bold = bold;
  }

  /**
   * boldMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab boldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `bold` property is editable..
   * 
   * @return boldMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `bold` property is editable.")
  public PropertyMetadata getBoldMetadata() {
    return boldMetadata;
  }

  /**
   * setBoldMetadata.
   **/
  public void setBoldMetadata(PropertyMetadata boldMetadata) {
    this.boldMetadata = boldMetadata;
  }

  /**
   * caption.
   *
   * @return FormulaTab
   **/
  public FormulaTab caption(String caption) {
    this.caption = caption;
    return this;
  }

  /**
   * .
   * 
   * @return caption
   **/
  @Schema(description = "")
  public String getCaption() {
    return caption;
  }

  /**
   * setCaption.
   **/
  public void setCaption(String caption) {
    this.caption = caption;
  }

  /**
   * captionMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab captionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
    return this;
  }

  /**
   * Get captionMetadata.
   * 
   * @return captionMetadata
   **/
  @Schema(description = "")
  public PropertyMetadata getCaptionMetadata() {
    return captionMetadata;
  }

  /**
   * setCaptionMetadata.
   **/
  public void setCaptionMetadata(PropertyMetadata captionMetadata) {
    this.captionMetadata = captionMetadata;
  }

  /**
   * concealValueOnDocument.
   *
   * @return FormulaTab
   **/
  public FormulaTab concealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
    return this;
  }

  /**
   * When set to **true**, the field appears normally while the recipient is
   * adding or modifying the information in the field, but the data is not visible
   * (the characters are hidden by asterisks) to any other signer or the sender.
   * When an envelope is completed the information is available to the sender
   * through the Form Data link in the DocuSign Console. This setting applies only
   * to text boxes and does not affect list boxes, radio buttons, or check boxes..
   * 
   * @return concealValueOnDocument
   **/
  @Schema(description = "When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.")
  public String getConcealValueOnDocument() {
    return concealValueOnDocument;
  }

  /**
   * setConcealValueOnDocument.
   **/
  public void setConcealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
  }

  /**
   * concealValueOnDocumentMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab concealValueOnDocumentMetadata(PropertyMetadata concealValueOnDocumentMetadata) {
    this.concealValueOnDocumentMetadata = concealValueOnDocumentMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `concealValueOnDocument` property is
   * editable..
   * 
   * @return concealValueOnDocumentMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `concealValueOnDocument` property is editable.")
  public PropertyMetadata getConcealValueOnDocumentMetadata() {
    return concealValueOnDocumentMetadata;
  }

  /**
   * setConcealValueOnDocumentMetadata.
   **/
  public void setConcealValueOnDocumentMetadata(PropertyMetadata concealValueOnDocumentMetadata) {
    this.concealValueOnDocumentMetadata = concealValueOnDocumentMetadata;
  }

  /**
   * conditionalParentLabel.
   *
   * @return FormulaTab
   **/
  public FormulaTab conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

  /**
   * For conditional fields this is the TabLabel of the parent tab that controls
   * this tab's visibility..
   * 
   * @return conditionalParentLabel
   **/
  @Schema(description = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  /**
   * setConditionalParentLabel.
   **/
  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  /**
   * conditionalParentLabelMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab conditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `conditionalParentLabel` property is
   * editable..
   * 
   * @return conditionalParentLabelMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `conditionalParentLabel` property is editable.")
  public PropertyMetadata getConditionalParentLabelMetadata() {
    return conditionalParentLabelMetadata;
  }

  /**
   * setConditionalParentLabelMetadata.
   **/
  public void setConditionalParentLabelMetadata(PropertyMetadata conditionalParentLabelMetadata) {
    this.conditionalParentLabelMetadata = conditionalParentLabelMetadata;
  }

  /**
   * conditionalParentValue.
   *
   * @return FormulaTab
   **/
  public FormulaTab conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

  /**
   * For conditional fields, this is the value of the parent tab that controls the
   * tab's visibility. If the parent tab is a Checkbox, Radio button, Optional
   * Signature, or Optional Initial use \"on\" as the value to show that the
   * parent tab is active. .
   * 
   * @return conditionalParentValue
   **/
  @Schema(description = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  /**
   * setConditionalParentValue.
   **/
  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  /**
   * conditionalParentValueMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab conditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `conditionalParentValue` property is
   * editable..
   * 
   * @return conditionalParentValueMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `conditionalParentValue` property is editable.")
  public PropertyMetadata getConditionalParentValueMetadata() {
    return conditionalParentValueMetadata;
  }

  /**
   * setConditionalParentValueMetadata.
   **/
  public void setConditionalParentValueMetadata(PropertyMetadata conditionalParentValueMetadata) {
    this.conditionalParentValueMetadata = conditionalParentValueMetadata;
  }

  /**
   * customTabId.
   *
   * @return FormulaTab
   **/
  public FormulaTab customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

  /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This
   * can only be used when adding new tabs for a recipient. When used, the new tab
   * inherits all the custom tab properties..
   * 
   * @return customTabId
   **/
  @Schema(description = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  /**
   * setCustomTabId.
   **/
  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  /**
   * customTabIdMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab customTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `customTabId` property is editable..
   * 
   * @return customTabIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `customTabId` property is editable.")
  public PropertyMetadata getCustomTabIdMetadata() {
    return customTabIdMetadata;
  }

  /**
   * setCustomTabIdMetadata.
   **/
  public void setCustomTabIdMetadata(PropertyMetadata customTabIdMetadata) {
    this.customTabIdMetadata = customTabIdMetadata;
  }

  /**
   * disableAutoSize.
   *
   * @return FormulaTab
   **/
  public FormulaTab disableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
    return this;
  }

  /**
   * When set to **true**, disables the auto sizing of single line text boxes in
   * the signing screen when the signer enters data. If disabled users will only
   * be able enter as much data as the text box can hold. By default this is
   * false. This property only affects single line text boxes..
   * 
   * @return disableAutoSize
   **/
  @Schema(description = "When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.")
  public String getDisableAutoSize() {
    return disableAutoSize;
  }

  /**
   * setDisableAutoSize.
   **/
  public void setDisableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
  }

  /**
   * disableAutoSizeMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab disableAutoSizeMetadata(PropertyMetadata disableAutoSizeMetadata) {
    this.disableAutoSizeMetadata = disableAutoSizeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `disableAutoSize` property is editable..
   * 
   * @return disableAutoSizeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `disableAutoSize` property is editable.")
  public PropertyMetadata getDisableAutoSizeMetadata() {
    return disableAutoSizeMetadata;
  }

  /**
   * setDisableAutoSizeMetadata.
   **/
  public void setDisableAutoSizeMetadata(PropertyMetadata disableAutoSizeMetadata) {
    this.disableAutoSizeMetadata = disableAutoSizeMetadata;
  }

  /**
   * documentId.
   *
   * @return FormulaTab
   **/
  public FormulaTab documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

  /**
   * Specifies the document ID number that the tab is placed on. This must refer
   * to an existing Document's ID attribute..
   * 
   * @return documentId
   **/
  @Schema(description = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  /**
   * setDocumentId.
   **/
  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  /**
   * documentIdMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab documentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `documentId` property is editable..
   * 
   * @return documentIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `documentId` property is editable.")
  public PropertyMetadata getDocumentIdMetadata() {
    return documentIdMetadata;
  }

  /**
   * setDocumentIdMetadata.
   **/
  public void setDocumentIdMetadata(PropertyMetadata documentIdMetadata) {
    this.documentIdMetadata = documentIdMetadata;
  }

  /**
   * errorDetails.
   *
   * @return FormulaTab
   **/
  public FormulaTab errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

  /**
   * This object describes errors that occur. It is only valid for responses and
   * ignored in requests..
   * 
   * @return errorDetails
   **/
  @Schema(description = "This object describes errors that occur. It is only valid for responses and ignored in requests.")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  /**
   * setErrorDetails.
   **/
  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  /**
   * font.
   *
   * @return FormulaTab
   **/
  public FormulaTab font(String font) {
    this.font = font;
    return this;
  }

  /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial,
   * ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,
   * LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho,
   * Default..
   * 
   * @return font
   **/
  @Schema(description = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  /**
   * setFont.
   **/
  public void setFont(String font) {
    this.font = font;
  }

  /**
   * fontColor.
   *
   * @return FormulaTab
   **/
  public FormulaTab fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

  /**
   * The font color used for the information in the tab. Possible values are:
   * Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue,
   * Purple, or White..
   * 
   * @return fontColor
   **/
  @Schema(description = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  /**
   * setFontColor.
   **/
  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  /**
   * fontColorMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab fontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `fontColor` property is editable..
   * 
   * @return fontColorMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `fontColor` property is editable.")
  public PropertyMetadata getFontColorMetadata() {
    return fontColorMetadata;
  }

  /**
   * setFontColorMetadata.
   **/
  public void setFontColorMetadata(PropertyMetadata fontColorMetadata) {
    this.fontColorMetadata = fontColorMetadata;
  }

  /**
   * fontMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab fontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `font` property is editable..
   * 
   * @return fontMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `font` property is editable.")
  public PropertyMetadata getFontMetadata() {
    return fontMetadata;
  }

  /**
   * setFontMetadata.
   **/
  public void setFontMetadata(PropertyMetadata fontMetadata) {
    this.fontMetadata = fontMetadata;
  }

  /**
   * fontSize.
   *
   * @return FormulaTab
   **/
  public FormulaTab fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

  /**
   * The font size used for the information in the tab. Possible values are:
   * Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20,
   * Size22, Size24, Size26, Size28, Size36, Size48, or Size72..
   * 
   * @return fontSize
   **/
  @Schema(description = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  /**
   * setFontSize.
   **/
  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  /**
   * fontSizeMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab fontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `fontSize` property is editable..
   * 
   * @return fontSizeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `fontSize` property is editable.")
  public PropertyMetadata getFontSizeMetadata() {
    return fontSizeMetadata;
  }

  /**
   * setFontSizeMetadata.
   **/
  public void setFontSizeMetadata(PropertyMetadata fontSizeMetadata) {
    this.fontSizeMetadata = fontSizeMetadata;
  }

  /**
   * formOrder.
   *
   * @return FormulaTab
   **/
  public FormulaTab formOrder(String formOrder) {
    this.formOrder = formOrder;
    return this;
  }

  /**
   * .
   * 
   * @return formOrder
   **/
  @Schema(description = "")
  public String getFormOrder() {
    return formOrder;
  }

  /**
   * setFormOrder.
   **/
  public void setFormOrder(String formOrder) {
    this.formOrder = formOrder;
  }

  /**
   * formOrderMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab formOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `formOrder` property is editable..
   * 
   * @return formOrderMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `formOrder` property is editable.")
  public PropertyMetadata getFormOrderMetadata() {
    return formOrderMetadata;
  }

  /**
   * setFormOrderMetadata.
   **/
  public void setFormOrderMetadata(PropertyMetadata formOrderMetadata) {
    this.formOrderMetadata = formOrderMetadata;
  }

  /**
   * formPageLabel.
   *
   * @return FormulaTab
   **/
  public FormulaTab formPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
    return this;
  }

  /**
   * .
   * 
   * @return formPageLabel
   **/
  @Schema(description = "")
  public String getFormPageLabel() {
    return formPageLabel;
  }

  /**
   * setFormPageLabel.
   **/
  public void setFormPageLabel(String formPageLabel) {
    this.formPageLabel = formPageLabel;
  }

  /**
   * formPageLabelMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab formPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `formPageLabel` property is editable..
   * 
   * @return formPageLabelMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `formPageLabel` property is editable.")
  public PropertyMetadata getFormPageLabelMetadata() {
    return formPageLabelMetadata;
  }

  /**
   * setFormPageLabelMetadata.
   **/
  public void setFormPageLabelMetadata(PropertyMetadata formPageLabelMetadata) {
    this.formPageLabelMetadata = formPageLabelMetadata;
  }

  /**
   * formPageNumber.
   *
   * @return FormulaTab
   **/
  public FormulaTab formPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
    return this;
  }

  /**
   * .
   * 
   * @return formPageNumber
   **/
  @Schema(description = "")
  public String getFormPageNumber() {
    return formPageNumber;
  }

  /**
   * setFormPageNumber.
   **/
  public void setFormPageNumber(String formPageNumber) {
    this.formPageNumber = formPageNumber;
  }

  /**
   * formPageNumberMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab formPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `fromPageNumber` property is editable..
   * 
   * @return formPageNumberMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `fromPageNumber` property is editable.")
  public PropertyMetadata getFormPageNumberMetadata() {
    return formPageNumberMetadata;
  }

  /**
   * setFormPageNumberMetadata.
   **/
  public void setFormPageNumberMetadata(PropertyMetadata formPageNumberMetadata) {
    this.formPageNumberMetadata = formPageNumberMetadata;
  }

  /**
   * formula.
   *
   * @return FormulaTab
   **/
  public FormulaTab formula(String formula) {
    this.formula = formula;
    return this;
  }

  /**
   * The Formula string contains the TabLabel for the reference tabs used in the
   * formula and calculation operators. Each TabLabel must be contained in
   * brackets. Maximum Length: 2000 characters. *Example*: Three tabs (TabLabels:
   * Line1, Line2, and Tax) need to be added together. The formula string would
   * be: [Line1]+[Line2]+[Tax].
   * 
   * @return formula
   **/
  @Schema(description = "The Formula string contains the TabLabel for the reference tabs used in the formula and calculation operators. Each TabLabel must be contained in brackets.  Maximum Length: 2000 characters.  *Example*: Three tabs (TabLabels: Line1, Line2, and Tax) need to be added together. The formula string would be:   [Line1]+[Line2]+[Tax]")
  public String getFormula() {
    return formula;
  }

  /**
   * setFormula.
   **/
  public void setFormula(String formula) {
    this.formula = formula;
  }

  /**
   * formulaMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab formulaMetadata(PropertyMetadata formulaMetadata) {
    this.formulaMetadata = formulaMetadata;
    return this;
  }

  /**
   * Metadata indicating if the sender can edit the `formula` property..
   * 
   * @return formulaMetadata
   **/
  @Schema(description = "Metadata indicating if the sender can edit the `formula` property.")
  public PropertyMetadata getFormulaMetadata() {
    return formulaMetadata;
  }

  /**
   * setFormulaMetadata.
   **/
  public void setFormulaMetadata(PropertyMetadata formulaMetadata) {
    this.formulaMetadata = formulaMetadata;
  }

  /**
   * height.
   *
   * @return FormulaTab
   **/
  public FormulaTab height(String height) {
    this.height = height;
    return this;
  }

  /**
   * Height of the tab in pixels..
   * 
   * @return height
   **/
  @Schema(description = "Height of the tab in pixels.")
  public String getHeight() {
    return height;
  }

  /**
   * setHeight.
   **/
  public void setHeight(String height) {
    this.height = height;
  }

  /**
   * heightMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab heightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `height` property is editable..
   * 
   * @return heightMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `height` property is editable.")
  public PropertyMetadata getHeightMetadata() {
    return heightMetadata;
  }

  /**
   * setHeightMetadata.
   **/
  public void setHeightMetadata(PropertyMetadata heightMetadata) {
    this.heightMetadata = heightMetadata;
  }

  /**
   * hidden.
   *
   * @return FormulaTab
   **/
  public FormulaTab hidden(String hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * .
   * 
   * @return hidden
   **/
  @Schema(description = "")
  public String getHidden() {
    return hidden;
  }

  /**
   * setHidden.
   **/
  public void setHidden(String hidden) {
    this.hidden = hidden;
  }

  /**
   * hiddenMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab hiddenMetadata(PropertyMetadata hiddenMetadata) {
    this.hiddenMetadata = hiddenMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `hidden` property is editable..
   * 
   * @return hiddenMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `hidden` property is editable.")
  public PropertyMetadata getHiddenMetadata() {
    return hiddenMetadata;
  }

  /**
   * setHiddenMetadata.
   **/
  public void setHiddenMetadata(PropertyMetadata hiddenMetadata) {
    this.hiddenMetadata = hiddenMetadata;
  }

  /**
   * isPaymentAmount.
   *
   * @return FormulaTab
   **/
  public FormulaTab isPaymentAmount(String isPaymentAmount) {
    this.isPaymentAmount = isPaymentAmount;
    return this;
  }

  /**
   * When set to **true**, sets this as a payment tab. Can only be used with Text,
   * Number, Formula, or List tabs. The value of the tab must be a number. .
   * 
   * @return isPaymentAmount
   **/
  @Schema(description = "When set to **true**, sets this as a payment tab. Can only be used with Text, Number, Formula, or List tabs. The value of the tab must be a number. ")
  public String getIsPaymentAmount() {
    return isPaymentAmount;
  }

  /**
   * setIsPaymentAmount.
   **/
  public void setIsPaymentAmount(String isPaymentAmount) {
    this.isPaymentAmount = isPaymentAmount;
  }

  /**
   * isPaymentAmountMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab isPaymentAmountMetadata(PropertyMetadata isPaymentAmountMetadata) {
    this.isPaymentAmountMetadata = isPaymentAmountMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return isPaymentAmountMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getIsPaymentAmountMetadata() {
    return isPaymentAmountMetadata;
  }

  /**
   * setIsPaymentAmountMetadata.
   **/
  public void setIsPaymentAmountMetadata(PropertyMetadata isPaymentAmountMetadata) {
    this.isPaymentAmountMetadata = isPaymentAmountMetadata;
  }

  /**
   * italic.
   *
   * @return FormulaTab
   **/
  public FormulaTab italic(String italic) {
    this.italic = italic;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is italic..
   * 
   * @return italic
   **/
  @Schema(description = "When set to **true**, the information in the tab is italic.")
  public String getItalic() {
    return italic;
  }

  /**
   * setItalic.
   **/
  public void setItalic(String italic) {
    this.italic = italic;
  }

  /**
   * italicMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab italicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `italic` property is editable..
   * 
   * @return italicMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `italic` property is editable.")
  public PropertyMetadata getItalicMetadata() {
    return italicMetadata;
  }

  /**
   * setItalicMetadata.
   **/
  public void setItalicMetadata(PropertyMetadata italicMetadata) {
    this.italicMetadata = italicMetadata;
  }

  /**
   * localePolicy.
   *
   * @return FormulaTab
   **/
  public FormulaTab localePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return localePolicy
   **/
  @Schema(description = "Reserved for DocuSign.")
  public LocalePolicyTab getLocalePolicy() {
    return localePolicy;
  }

  /**
   * setLocalePolicy.
   **/
  public void setLocalePolicy(LocalePolicyTab localePolicy) {
    this.localePolicy = localePolicy;
  }

  /**
   * locked.
   *
   * @return FormulaTab
   **/
  public FormulaTab locked(String locked) {
    this.locked = locked;
    return this;
  }

  /**
   * When set to **true**, the signer cannot change the data of the custom tab..
   * 
   * @return locked
   **/
  @Schema(description = "When set to **true**, the signer cannot change the data of the custom tab.")
  public String getLocked() {
    return locked;
  }

  /**
   * setLocked.
   **/
  public void setLocked(String locked) {
    this.locked = locked;
  }

  /**
   * lockedMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab lockedMetadata(PropertyMetadata lockedMetadata) {
    this.lockedMetadata = lockedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `locked` property is editable..
   * 
   * @return lockedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `locked` property is editable.")
  public PropertyMetadata getLockedMetadata() {
    return lockedMetadata;
  }

  /**
   * setLockedMetadata.
   **/
  public void setLockedMetadata(PropertyMetadata lockedMetadata) {
    this.lockedMetadata = lockedMetadata;
  }

  /**
   * maxLength.
   *
   * @return FormulaTab
   **/
  public FormulaTab maxLength(String maxLength) {
    this.maxLength = maxLength;
    return this;
  }

  /**
   * An optional value that describes the maximum length of the property when the
   * property is a string..
   * 
   * @return maxLength
   **/
  @Schema(description = "An optional value that describes the maximum length of the property when the property is a string.")
  public String getMaxLength() {
    return maxLength;
  }

  /**
   * setMaxLength.
   **/
  public void setMaxLength(String maxLength) {
    this.maxLength = maxLength;
  }

  /**
   * maxLengthMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab maxLengthMetadata(PropertyMetadata maxLengthMetadata) {
    this.maxLengthMetadata = maxLengthMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `maxLength` property is editable..
   * 
   * @return maxLengthMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `maxLength` property is editable.")
  public PropertyMetadata getMaxLengthMetadata() {
    return maxLengthMetadata;
  }

  /**
   * setMaxLengthMetadata.
   **/
  public void setMaxLengthMetadata(PropertyMetadata maxLengthMetadata) {
    this.maxLengthMetadata = maxLengthMetadata;
  }

  /**
   * mergeField.
   *
   * @return FormulaTab
   **/
  public FormulaTab mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

  /**
   * Contains the information necessary to map the tab to a field in SalesForce..
   * 
   * @return mergeField
   **/
  @Schema(description = "Contains the information necessary to map the tab to a field in SalesForce.")
  public MergeField getMergeField() {
    return mergeField;
  }

  /**
   * setMergeField.
   **/
  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  /**
   * mergeFieldXml.
   *
   * @return FormulaTab
   **/
  public FormulaTab mergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
    return this;
  }

  /**
   * .
   * 
   * @return mergeFieldXml
   **/
  @Schema(description = "")
  public String getMergeFieldXml() {
    return mergeFieldXml;
  }

  /**
   * setMergeFieldXml.
   **/
  public void setMergeFieldXml(String mergeFieldXml) {
    this.mergeFieldXml = mergeFieldXml;
  }

  /**
   * name.
   *
   * @return FormulaTab
   **/
  public FormulaTab name(String name) {
    this.name = name;
    return this;
  }

  /**
   * .
   * 
   * @return name
   **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  /**
   * setName.
   **/
  public void setName(String name) {
    this.name = name;
  }

  /**
   * nameMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab nameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `name` property is editable. This
   * property is read-only..
   * 
   * @return nameMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `name` property is editable. This property is read-only.")
  public PropertyMetadata getNameMetadata() {
    return nameMetadata;
  }

  /**
   * setNameMetadata.
   **/
  public void setNameMetadata(PropertyMetadata nameMetadata) {
    this.nameMetadata = nameMetadata;
  }

  /**
   * originalValue.
   *
   * @return FormulaTab
   **/
  public FormulaTab originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

  /**
   * The initial value of the tab when it was sent to the recipient. .
   * 
   * @return originalValue
   **/
  @Schema(description = "The initial value of the tab when it was sent to the recipient. ")
  public String getOriginalValue() {
    return originalValue;
  }

  /**
   * setOriginalValue.
   **/
  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  /**
   * originalValueMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab originalValueMetadata(PropertyMetadata originalValueMetadata) {
    this.originalValueMetadata = originalValueMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `originalValue` property is editable..
   * 
   * @return originalValueMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `originalValue` property is editable.")
  public PropertyMetadata getOriginalValueMetadata() {
    return originalValueMetadata;
  }

  /**
   * setOriginalValueMetadata.
   **/
  public void setOriginalValueMetadata(PropertyMetadata originalValueMetadata) {
    this.originalValueMetadata = originalValueMetadata;
  }

  /**
   * pageNumber.
   *
   * @return FormulaTab
   **/
  public FormulaTab pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

  /**
   * Specifies the page number on which the tab is located..
   * 
   * @return pageNumber
   **/
  @Schema(description = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  /**
   * setPageNumber.
   **/
  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  /**
   * pageNumberMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab pageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `pageNumber` property is editable..
   * 
   * @return pageNumberMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `pageNumber` property is editable.")
  public PropertyMetadata getPageNumberMetadata() {
    return pageNumberMetadata;
  }

  /**
   * setPageNumberMetadata.
   **/
  public void setPageNumberMetadata(PropertyMetadata pageNumberMetadata) {
    this.pageNumberMetadata = pageNumberMetadata;
  }

  /**
   * paymentDetails.
   *
   * @return FormulaTab
   **/
  public FormulaTab paymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

  /**
   * This property indicates that this formula tab is a payment item. See
   * [Requesting Payments Along with Signatures][paymentguide] in the DocuSign
   * Support Center to learn more about payments. [paymentguide]:
   * https://support.docusign.com/en/guides/requesting-payments-along-with-signatures
   * .
   * 
   * @return paymentDetails
   **/
  @Schema(description = "This property indicates  that this formula tab  is a payment item.   See [Requesting Payments Along with Signatures][paymentguide]  in the DocuSign Support Center  to learn more about payments.   [paymentguide]:     https://support.docusign.com/en/guides/requesting-payments-along-with-signatures ")
  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  /**
   * setPaymentDetails.
   **/
  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  /**
   * recipientId.
   *
   * @return FormulaTab
   **/
  public FormulaTab recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

  /**
   * Unique for the recipient. It is used by the tab element to indicate which
   * recipient is to sign the Document..
   * 
   * @return recipientId
   **/
  @Schema(description = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  /**
   * setRecipientId.
   **/
  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  /**
   * recipientIdGuid.
   *
   * @return FormulaTab
   **/
  public FormulaTab recipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
    return this;
  }

  /**
   * .
   * 
   * @return recipientIdGuid
   **/
  @Schema(description = "")
  public String getRecipientIdGuid() {
    return recipientIdGuid;
  }

  /**
   * setRecipientIdGuid.
   **/
  public void setRecipientIdGuid(String recipientIdGuid) {
    this.recipientIdGuid = recipientIdGuid;
  }

  /**
   * recipientIdGuidMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab recipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipientIdGuid` property is editable..
   * 
   * @return recipientIdGuidMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `recipientIdGuid` property is editable.")
  public PropertyMetadata getRecipientIdGuidMetadata() {
    return recipientIdGuidMetadata;
  }

  /**
   * setRecipientIdGuidMetadata.
   **/
  public void setRecipientIdGuidMetadata(PropertyMetadata recipientIdGuidMetadata) {
    this.recipientIdGuidMetadata = recipientIdGuidMetadata;
  }

  /**
   * recipientIdMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab recipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `recipientId` property is editable..
   * 
   * @return recipientIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `recipientId` property is editable.")
  public PropertyMetadata getRecipientIdMetadata() {
    return recipientIdMetadata;
  }

  /**
   * setRecipientIdMetadata.
   **/
  public void setRecipientIdMetadata(PropertyMetadata recipientIdMetadata) {
    this.recipientIdMetadata = recipientIdMetadata;
  }

  /**
   * requireAll.
   *
   * @return FormulaTab
   **/
  public FormulaTab requireAll(String requireAll) {
    this.requireAll = requireAll;
    return this;
  }

  /**
   * When set to **true** and shared is true, information must be entered in this
   * field to complete the envelope. .
   * 
   * @return requireAll
   **/
  @Schema(description = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
  public String getRequireAll() {
    return requireAll;
  }

  /**
   * setRequireAll.
   **/
  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }

  /**
   * requireAllMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab requireAllMetadata(PropertyMetadata requireAllMetadata) {
    this.requireAllMetadata = requireAllMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `requireAll` property is editable..
   * 
   * @return requireAllMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `requireAll` property is editable.")
  public PropertyMetadata getRequireAllMetadata() {
    return requireAllMetadata;
  }

  /**
   * setRequireAllMetadata.
   **/
  public void setRequireAllMetadata(PropertyMetadata requireAllMetadata) {
    this.requireAllMetadata = requireAllMetadata;
  }

  /**
   * required.
   *
   * @return FormulaTab
   **/
  public FormulaTab required(String required) {
    this.required = required;
    return this;
  }

  /**
   * When set to **true**, the signer is required to fill out this tab.
   * 
   * @return required
   **/
  @Schema(description = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  /**
   * setRequired.
   **/
  public void setRequired(String required) {
    this.required = required;
  }

  /**
   * requiredMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab requiredMetadata(PropertyMetadata requiredMetadata) {
    this.requiredMetadata = requiredMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `required` property is editable..
   * 
   * @return requiredMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `required` property is editable.")
  public PropertyMetadata getRequiredMetadata() {
    return requiredMetadata;
  }

  /**
   * setRequiredMetadata.
   **/
  public void setRequiredMetadata(PropertyMetadata requiredMetadata) {
    this.requiredMetadata = requiredMetadata;
  }

  /**
   * requireInitialOnSharedChange.
   *
   * @return FormulaTab
   **/
  public FormulaTab requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }

  /**
   * Optional element for field markup. When set to **true**, the signer is
   * required to initial when they modify a shared field..
   * 
   * @return requireInitialOnSharedChange
   **/
  @Schema(description = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
  public String getRequireInitialOnSharedChange() {
    return requireInitialOnSharedChange;
  }

  /**
   * setRequireInitialOnSharedChange.
   **/
  public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
  }

  /**
   * requireInitialOnSharedChangeMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab requireInitialOnSharedChangeMetadata(PropertyMetadata requireInitialOnSharedChangeMetadata) {
    this.requireInitialOnSharedChangeMetadata = requireInitialOnSharedChangeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `requireInitialOnSharedChange` property
   * is editable..
   * 
   * @return requireInitialOnSharedChangeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `requireInitialOnSharedChange` property is editable.")
  public PropertyMetadata getRequireInitialOnSharedChangeMetadata() {
    return requireInitialOnSharedChangeMetadata;
  }

  /**
   * setRequireInitialOnSharedChangeMetadata.
   **/
  public void setRequireInitialOnSharedChangeMetadata(PropertyMetadata requireInitialOnSharedChangeMetadata) {
    this.requireInitialOnSharedChangeMetadata = requireInitialOnSharedChangeMetadata;
  }

  /**
   * roundDecimalPlaces.
   *
   * @return FormulaTab
   **/
  public FormulaTab roundDecimalPlaces(String roundDecimalPlaces) {
    this.roundDecimalPlaces = roundDecimalPlaces;
    return this;
  }

  /**
   * .
   * 
   * @return roundDecimalPlaces
   **/
  @Schema(description = "")
  public String getRoundDecimalPlaces() {
    return roundDecimalPlaces;
  }

  /**
   * setRoundDecimalPlaces.
   **/
  public void setRoundDecimalPlaces(String roundDecimalPlaces) {
    this.roundDecimalPlaces = roundDecimalPlaces;
  }

  /**
   * roundDecimalPlacesMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab roundDecimalPlacesMetadata(PropertyMetadata roundDecimalPlacesMetadata) {
    this.roundDecimalPlacesMetadata = roundDecimalPlacesMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `roundDecimalPlaces` property is
   * editable..
   * 
   * @return roundDecimalPlacesMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `roundDecimalPlaces` property is editable.")
  public PropertyMetadata getRoundDecimalPlacesMetadata() {
    return roundDecimalPlacesMetadata;
  }

  /**
   * setRoundDecimalPlacesMetadata.
   **/
  public void setRoundDecimalPlacesMetadata(PropertyMetadata roundDecimalPlacesMetadata) {
    this.roundDecimalPlacesMetadata = roundDecimalPlacesMetadata;
  }

  /**
   * senderRequired.
   *
   * @return FormulaTab
   **/
  public FormulaTab senderRequired(String senderRequired) {
    this.senderRequired = senderRequired;
    return this;
  }

  /**
   * When set to **true**, the sender must populate the tab before an envelope can
   * be sent using the template. This value tab can only be changed by modifying
   * (PUT) the template. Tabs with a `senderRequired` value of true cannot be
   * deleted from an envelope..
   * 
   * @return senderRequired
   **/
  @Schema(description = "When set to **true**, the sender must populate the tab before an envelope can be sent using the template.   This value tab can only be changed by modifying (PUT) the template.   Tabs with a `senderRequired` value of true cannot be deleted from an envelope.")
  public String getSenderRequired() {
    return senderRequired;
  }

  /**
   * setSenderRequired.
   **/
  public void setSenderRequired(String senderRequired) {
    this.senderRequired = senderRequired;
  }

  /**
   * senderRequiredMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab senderRequiredMetadata(PropertyMetadata senderRequiredMetadata) {
    this.senderRequiredMetadata = senderRequiredMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `senderRequired` property is editable..
   * 
   * @return senderRequiredMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `senderRequired` property is editable.")
  public PropertyMetadata getSenderRequiredMetadata() {
    return senderRequiredMetadata;
  }

  /**
   * setSenderRequiredMetadata.
   **/
  public void setSenderRequiredMetadata(PropertyMetadata senderRequiredMetadata) {
    this.senderRequiredMetadata = senderRequiredMetadata;
  }

  /**
   * shared.
   *
   * @return FormulaTab
   **/
  public FormulaTab shared(String shared) {
    this.shared = shared;
    return this;
  }

  /**
   * When set to **true**, this custom tab is shared..
   * 
   * @return shared
   **/
  @Schema(description = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  /**
   * setShared.
   **/
  public void setShared(String shared) {
    this.shared = shared;
  }

  /**
   * sharedMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab sharedMetadata(PropertyMetadata sharedMetadata) {
    this.sharedMetadata = sharedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `shared` property is editable..
   * 
   * @return sharedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `shared` property is editable.")
  public PropertyMetadata getSharedMetadata() {
    return sharedMetadata;
  }

  /**
   * setSharedMetadata.
   **/
  public void setSharedMetadata(PropertyMetadata sharedMetadata) {
    this.sharedMetadata = sharedMetadata;
  }

  /**
   * shareToRecipients.
   *
   * @return FormulaTab
   **/
  public FormulaTab shareToRecipients(String shareToRecipients) {
    this.shareToRecipients = shareToRecipients;
    return this;
  }

  /**
   * .
   * 
   * @return shareToRecipients
   **/
  @Schema(description = "")
  public String getShareToRecipients() {
    return shareToRecipients;
  }

  /**
   * setShareToRecipients.
   **/
  public void setShareToRecipients(String shareToRecipients) {
    this.shareToRecipients = shareToRecipients;
  }

  /**
   * shareToRecipientsMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab shareToRecipientsMetadata(PropertyMetadata shareToRecipientsMetadata) {
    this.shareToRecipientsMetadata = shareToRecipientsMetadata;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return shareToRecipientsMetadata
   **/
  @Schema(description = "Reserved for DocuSign.")
  public PropertyMetadata getShareToRecipientsMetadata() {
    return shareToRecipientsMetadata;
  }

  /**
   * setShareToRecipientsMetadata.
   **/
  public void setShareToRecipientsMetadata(PropertyMetadata shareToRecipientsMetadata) {
    this.shareToRecipientsMetadata = shareToRecipientsMetadata;
  }

  /**
   * smartContractInformation.
   *
   * @return FormulaTab
   **/
  public FormulaTab smartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
    return this;
  }

  /**
   * Reserved for DocuSign..
   * 
   * @return smartContractInformation
   **/
  @Schema(description = "Reserved for DocuSign.")
  public SmartContractInformation getSmartContractInformation() {
    return smartContractInformation;
  }

  /**
   * setSmartContractInformation.
   **/
  public void setSmartContractInformation(SmartContractInformation smartContractInformation) {
    this.smartContractInformation = smartContractInformation;
  }

  /**
   * source.
   *
   * @return FormulaTab
   **/
  public FormulaTab source(String source) {
    this.source = source;
    return this;
  }

  /**
   * .
   * 
   * @return source
   **/
  @Schema(description = "")
  public String getSource() {
    return source;
  }

  /**
   * setSource.
   **/
  public void setSource(String source) {
    this.source = source;
  }

  /**
   * status.
   *
   * @return FormulaTab
   **/
  public FormulaTab status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Indicates the envelope status. Valid values are: * sent - The envelope is
   * sent to the recipients. * created - The envelope is saved as a draft and can
   * be modified and sent later..
   * 
   * @return status
   **/
  @Schema(description = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  /**
   * setStatus.
   **/
  public void setStatus(String status) {
    this.status = status;
  }

  /**
   * statusMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab statusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `status` property is editable..
   * 
   * @return statusMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `status` property is editable.")
  public PropertyMetadata getStatusMetadata() {
    return statusMetadata;
  }

  /**
   * setStatusMetadata.
   **/
  public void setStatusMetadata(PropertyMetadata statusMetadata) {
    this.statusMetadata = statusMetadata;
  }

  /**
   * tabGroupLabels.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  /**
   * addTabGroupLabelsItem.
   *
   * @return FormulaTab
   **/
  public FormulaTab addTabGroupLabelsItem(String tabGroupLabelsItem) {
    if (this.tabGroupLabels == null) {
      this.tabGroupLabels = new java.util.ArrayList<>();
    }
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

  /**
   * .
   * 
   * @return tabGroupLabels
   **/
  @Schema(description = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  /**
   * setTabGroupLabels.
   **/
  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }

  /**
   * tabGroupLabelsMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabGroupLabels` property is editable..
   * 
   * @return tabGroupLabelsMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabGroupLabels` property is editable.")
  public PropertyMetadata getTabGroupLabelsMetadata() {
    return tabGroupLabelsMetadata;
  }

  /**
   * setTabGroupLabelsMetadata.
   **/
  public void setTabGroupLabelsMetadata(PropertyMetadata tabGroupLabelsMetadata) {
    this.tabGroupLabelsMetadata = tabGroupLabelsMetadata;
  }

  /**
   * tabId.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

  /**
   * The unique identifier for the tab. The tabid can be retrieved with the
   * [ML:GET call]. .
   * 
   * @return tabId
   **/
  @Schema(description = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  /**
   * setTabId.
   **/
  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  /**
   * tabIdMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabId` property is editable..
   * 
   * @return tabIdMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabId` property is editable.")
  public PropertyMetadata getTabIdMetadata() {
    return tabIdMetadata;
  }

  /**
   * setTabIdMetadata.
   **/
  public void setTabIdMetadata(PropertyMetadata tabIdMetadata) {
    this.tabIdMetadata = tabIdMetadata;
  }

  /**
   * tabLabel.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

  /**
   * The label string associated with the tab..
   * 
   * @return tabLabel
   **/
  @Schema(description = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  /**
   * setTabLabel.
   **/
  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  /**
   * tabLabelMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabLabel` property is editable..
   * 
   * @return tabLabelMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabLabel` property is editable.")
  public PropertyMetadata getTabLabelMetadata() {
    return tabLabelMetadata;
  }

  /**
   * setTabLabelMetadata.
   **/
  public void setTabLabelMetadata(PropertyMetadata tabLabelMetadata) {
    this.tabLabelMetadata = tabLabelMetadata;
  }

  /**
   * tabOrder.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

  /**
   * .
   * 
   * @return tabOrder
   **/
  @Schema(description = "")
  public String getTabOrder() {
    return tabOrder;
  }

  /**
   * setTabOrder.
   **/
  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  /**
   * tabOrderMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabOrder` property is editable..
   * 
   * @return tabOrderMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabOrder` property is editable.")
  public PropertyMetadata getTabOrderMetadata() {
    return tabOrderMetadata;
  }

  /**
   * setTabOrderMetadata.
   **/
  public void setTabOrderMetadata(PropertyMetadata tabOrderMetadata) {
    this.tabOrderMetadata = tabOrderMetadata;
  }

  /**
   * tabType.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabType(String tabType) {
    this.tabType = tabType;
    return this;
  }

  /**
   * .
   * 
   * @return tabType
   **/
  @Schema(description = "")
  public String getTabType() {
    return tabType;
  }

  /**
   * setTabType.
   **/
  public void setTabType(String tabType) {
    this.tabType = tabType;
  }

  /**
   * tabTypeMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab tabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `tabType` property is editable..
   * 
   * @return tabTypeMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `tabType` property is editable.")
  public PropertyMetadata getTabTypeMetadata() {
    return tabTypeMetadata;
  }

  /**
   * setTabTypeMetadata.
   **/
  public void setTabTypeMetadata(PropertyMetadata tabTypeMetadata) {
    this.tabTypeMetadata = tabTypeMetadata;
  }

  /**
   * templateLocked.
   *
   * @return FormulaTab
   **/
  public FormulaTab templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

  /**
   * When set to **true**, the sender cannot change any attributes of the
   * recipient. Used only when working with template recipients. .
   * 
   * @return templateLocked
   **/
  @Schema(description = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  /**
   * setTemplateLocked.
   **/
  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  /**
   * templateLockedMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab templateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `templateLocked` property is editable..
   * 
   * @return templateLockedMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `templateLocked` property is editable.")
  public PropertyMetadata getTemplateLockedMetadata() {
    return templateLockedMetadata;
  }

  /**
   * setTemplateLockedMetadata.
   **/
  public void setTemplateLockedMetadata(PropertyMetadata templateLockedMetadata) {
    this.templateLockedMetadata = templateLockedMetadata;
  }

  /**
   * templateRequired.
   *
   * @return FormulaTab
   **/
  public FormulaTab templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

  /**
   * When set to **true**, the sender may not remove the recipient. Used only when
   * working with template recipients..
   * 
   * @return templateRequired
   **/
  @Schema(description = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  /**
   * setTemplateRequired.
   **/
  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  /**
   * templateRequiredMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab templateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `templateRequired` property is editable..
   * 
   * @return templateRequiredMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `templateRequired` property is editable.")
  public PropertyMetadata getTemplateRequiredMetadata() {
    return templateRequiredMetadata;
  }

  /**
   * setTemplateRequiredMetadata.
   **/
  public void setTemplateRequiredMetadata(PropertyMetadata templateRequiredMetadata) {
    this.templateRequiredMetadata = templateRequiredMetadata;
  }

  /**
   * tooltip.
   *
   * @return FormulaTab
   **/
  public FormulaTab tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

  /**
   * .
   * 
   * @return tooltip
   **/
  @Schema(description = "")
  public String getTooltip() {
    return tooltip;
  }

  /**
   * setTooltip.
   **/
  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  /**
   * toolTipMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab toolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `toolTip` property is editable..
   * 
   * @return toolTipMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `toolTip` property is editable.")
  public PropertyMetadata getToolTipMetadata() {
    return toolTipMetadata;
  }

  /**
   * setToolTipMetadata.
   **/
  public void setToolTipMetadata(PropertyMetadata toolTipMetadata) {
    this.toolTipMetadata = toolTipMetadata;
  }

  /**
   * underline.
   *
   * @return FormulaTab
   **/
  public FormulaTab underline(String underline) {
    this.underline = underline;
    return this;
  }

  /**
   * When set to **true**, the information in the tab is underlined..
   * 
   * @return underline
   **/
  @Schema(description = "When set to **true**, the information in the tab is underlined.")
  public String getUnderline() {
    return underline;
  }

  /**
   * setUnderline.
   **/
  public void setUnderline(String underline) {
    this.underline = underline;
  }

  /**
   * underlineMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab underlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `underline` property is editable..
   * 
   * @return underlineMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `underline` property is editable.")
  public PropertyMetadata getUnderlineMetadata() {
    return underlineMetadata;
  }

  /**
   * setUnderlineMetadata.
   **/
  public void setUnderlineMetadata(PropertyMetadata underlineMetadata) {
    this.underlineMetadata = underlineMetadata;
  }

  /**
   * validationMessage.
   *
   * @return FormulaTab
   **/
  public FormulaTab validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

  /**
   * The message displayed if the custom tab fails input validation (either custom
   * of embedded)..
   * 
   * @return validationMessage
   **/
  @Schema(description = "The message displayed if the custom tab fails input validation (either custom of embedded).")
  public String getValidationMessage() {
    return validationMessage;
  }

  /**
   * setValidationMessage.
   **/
  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  /**
   * validationMessageMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab validationMessageMetadata(PropertyMetadata validationMessageMetadata) {
    this.validationMessageMetadata = validationMessageMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `validationMessage` property is
   * editable..
   * 
   * @return validationMessageMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `validationMessage` property is editable.")
  public PropertyMetadata getValidationMessageMetadata() {
    return validationMessageMetadata;
  }

  /**
   * setValidationMessageMetadata.
   **/
  public void setValidationMessageMetadata(PropertyMetadata validationMessageMetadata) {
    this.validationMessageMetadata = validationMessageMetadata;
  }

  /**
   * validationPattern.
   *
   * @return FormulaTab
   **/
  public FormulaTab validationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
    return this;
  }

  /**
   * A regular expression used to validate input for the tab..
   * 
   * @return validationPattern
   **/
  @Schema(description = "A regular expression used to validate input for the tab.")
  public String getValidationPattern() {
    return validationPattern;
  }

  /**
   * setValidationPattern.
   **/
  public void setValidationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
  }

  /**
   * validationPatternMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab validationPatternMetadata(PropertyMetadata validationPatternMetadata) {
    this.validationPatternMetadata = validationPatternMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `validationPattern` property is
   * editable..
   * 
   * @return validationPatternMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `validationPattern` property is editable.")
  public PropertyMetadata getValidationPatternMetadata() {
    return validationPatternMetadata;
  }

  /**
   * setValidationPatternMetadata.
   **/
  public void setValidationPatternMetadata(PropertyMetadata validationPatternMetadata) {
    this.validationPatternMetadata = validationPatternMetadata;
  }

  /**
   * value.
   *
   * @return FormulaTab
   **/
  public FormulaTab value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Specifies the value of the tab. .
   * 
   * @return value
   **/
  @Schema(description = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  /**
   * setValue.
   **/
  public void setValue(String value) {
    this.value = value;
  }

  /**
   * valueMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab valueMetadata(PropertyMetadata valueMetadata) {
    this.valueMetadata = valueMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `value` property is editable..
   * 
   * @return valueMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `value` property is editable.")
  public PropertyMetadata getValueMetadata() {
    return valueMetadata;
  }

  /**
   * setValueMetadata.
   **/
  public void setValueMetadata(PropertyMetadata valueMetadata) {
    this.valueMetadata = valueMetadata;
  }

  /**
   * width.
   *
   * @return FormulaTab
   **/
  public FormulaTab width(String width) {
    this.width = width;
    return this;
  }

  /**
   * Width of the tab in pixels..
   * 
   * @return width
   **/
  @Schema(description = "Width of the tab in pixels.")
  public String getWidth() {
    return width;
  }

  /**
   * setWidth.
   **/
  public void setWidth(String width) {
    this.width = width;
  }

  /**
   * widthMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab widthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `width` property is editable..
   * 
   * @return widthMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `width` property is editable.")
  public PropertyMetadata getWidthMetadata() {
    return widthMetadata;
  }

  /**
   * setWidthMetadata.
   **/
  public void setWidthMetadata(PropertyMetadata widthMetadata) {
    this.widthMetadata = widthMetadata;
  }

  /**
   * xPosition.
   *
   * @return FormulaTab
   **/
  public FormulaTab xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

  /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses
   * 72 DPI when determining position..
   * 
   * @return xPosition
   **/
  @Schema(description = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  /**
   * setXPosition.
   **/
  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  /**
   * xPositionMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab xPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `xPosition` property is editable..
   * 
   * @return xPositionMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `xPosition` property is editable.")
  public PropertyMetadata getXPositionMetadata() {
    return xPositionMetadata;
  }

  /**
   * setXPositionMetadata.
   **/
  public void setXPositionMetadata(PropertyMetadata xPositionMetadata) {
    this.xPositionMetadata = xPositionMetadata;
  }

  /**
   * yPosition.
   *
   * @return FormulaTab
   **/
  public FormulaTab yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

  /**
   * This indicates the vertical offset of the object on the page. DocuSign uses
   * 72 DPI when determining position..
   * 
   * @return yPosition
   **/
  @Schema(description = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  /**
   * setYPosition.
   **/
  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }

  /**
   * yPositionMetadata.
   *
   * @return FormulaTab
   **/
  public FormulaTab yPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
    return this;
  }

  /**
   * Metadata that indicates whether the `yPosition` property is editable..
   * 
   * @return yPositionMetadata
   **/
  @Schema(description = "Metadata that indicates whether the `yPosition` property is editable.")
  public PropertyMetadata getYPositionMetadata() {
    return yPositionMetadata;
  }

  /**
   * setYPositionMetadata.
   **/
  public void setYPositionMetadata(PropertyMetadata yPositionMetadata) {
    this.yPositionMetadata = yPositionMetadata;
  }

  /**
   * Compares objects.
   *
   * @return true or false depending on comparison result.
   */
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaTab formulaTab = (FormulaTab) o;
    return Objects.equals(this.anchorAllowWhiteSpaceInCharacters, formulaTab.anchorAllowWhiteSpaceInCharacters) &&
        Objects.equals(this.anchorAllowWhiteSpaceInCharactersMetadata,
            formulaTab.anchorAllowWhiteSpaceInCharactersMetadata)
        &&
        Objects.equals(this.anchorCaseSensitive, formulaTab.anchorCaseSensitive) &&
        Objects.equals(this.anchorCaseSensitiveMetadata, formulaTab.anchorCaseSensitiveMetadata) &&
        Objects.equals(this.anchorHorizontalAlignment, formulaTab.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorHorizontalAlignmentMetadata, formulaTab.anchorHorizontalAlignmentMetadata) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, formulaTab.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorIgnoreIfNotPresentMetadata, formulaTab.anchorIgnoreIfNotPresentMetadata) &&
        Objects.equals(this.anchorMatchWholeWord, formulaTab.anchorMatchWholeWord) &&
        Objects.equals(this.anchorMatchWholeWordMetadata, formulaTab.anchorMatchWholeWordMetadata) &&
        Objects.equals(this.anchorString, formulaTab.anchorString) &&
        Objects.equals(this.anchorStringMetadata, formulaTab.anchorStringMetadata) &&
        Objects.equals(this.anchorTabProcessorVersion, formulaTab.anchorTabProcessorVersion) &&
        Objects.equals(this.anchorTabProcessorVersionMetadata, formulaTab.anchorTabProcessorVersionMetadata) &&
        Objects.equals(this.anchorUnits, formulaTab.anchorUnits) &&
        Objects.equals(this.anchorUnitsMetadata, formulaTab.anchorUnitsMetadata) &&
        Objects.equals(this.anchorXOffset, formulaTab.anchorXOffset) &&
        Objects.equals(this.anchorXOffsetMetadata, formulaTab.anchorXOffsetMetadata) &&
        Objects.equals(this.anchorYOffset, formulaTab.anchorYOffset) &&
        Objects.equals(this.anchorYOffsetMetadata, formulaTab.anchorYOffsetMetadata) &&
        Objects.equals(this.bold, formulaTab.bold) &&
        Objects.equals(this.boldMetadata, formulaTab.boldMetadata) &&
        Objects.equals(this.caption, formulaTab.caption) &&
        Objects.equals(this.captionMetadata, formulaTab.captionMetadata) &&
        Objects.equals(this.concealValueOnDocument, formulaTab.concealValueOnDocument) &&
        Objects.equals(this.concealValueOnDocumentMetadata, formulaTab.concealValueOnDocumentMetadata) &&
        Objects.equals(this.conditionalParentLabel, formulaTab.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentLabelMetadata, formulaTab.conditionalParentLabelMetadata) &&
        Objects.equals(this.conditionalParentValue, formulaTab.conditionalParentValue) &&
        Objects.equals(this.conditionalParentValueMetadata, formulaTab.conditionalParentValueMetadata) &&
        Objects.equals(this.customTabId, formulaTab.customTabId) &&
        Objects.equals(this.customTabIdMetadata, formulaTab.customTabIdMetadata) &&
        Objects.equals(this.disableAutoSize, formulaTab.disableAutoSize) &&
        Objects.equals(this.disableAutoSizeMetadata, formulaTab.disableAutoSizeMetadata) &&
        Objects.equals(this.documentId, formulaTab.documentId) &&
        Objects.equals(this.documentIdMetadata, formulaTab.documentIdMetadata) &&
        Objects.equals(this.errorDetails, formulaTab.errorDetails) &&
        Objects.equals(this.font, formulaTab.font) &&
        Objects.equals(this.fontColor, formulaTab.fontColor) &&
        Objects.equals(this.fontColorMetadata, formulaTab.fontColorMetadata) &&
        Objects.equals(this.fontMetadata, formulaTab.fontMetadata) &&
        Objects.equals(this.fontSize, formulaTab.fontSize) &&
        Objects.equals(this.fontSizeMetadata, formulaTab.fontSizeMetadata) &&
        Objects.equals(this.formOrder, formulaTab.formOrder) &&
        Objects.equals(this.formOrderMetadata, formulaTab.formOrderMetadata) &&
        Objects.equals(this.formPageLabel, formulaTab.formPageLabel) &&
        Objects.equals(this.formPageLabelMetadata, formulaTab.formPageLabelMetadata) &&
        Objects.equals(this.formPageNumber, formulaTab.formPageNumber) &&
        Objects.equals(this.formPageNumberMetadata, formulaTab.formPageNumberMetadata) &&
        Objects.equals(this.formula, formulaTab.formula) &&
        Objects.equals(this.formulaMetadata, formulaTab.formulaMetadata) &&
        Objects.equals(this.height, formulaTab.height) &&
        Objects.equals(this.heightMetadata, formulaTab.heightMetadata) &&
        Objects.equals(this.hidden, formulaTab.hidden) &&
        Objects.equals(this.hiddenMetadata, formulaTab.hiddenMetadata) &&
        Objects.equals(this.isPaymentAmount, formulaTab.isPaymentAmount) &&
        Objects.equals(this.isPaymentAmountMetadata, formulaTab.isPaymentAmountMetadata) &&
        Objects.equals(this.italic, formulaTab.italic) &&
        Objects.equals(this.italicMetadata, formulaTab.italicMetadata) &&
        Objects.equals(this.localePolicy, formulaTab.localePolicy) &&
        Objects.equals(this.locked, formulaTab.locked) &&
        Objects.equals(this.lockedMetadata, formulaTab.lockedMetadata) &&
        Objects.equals(this.maxLength, formulaTab.maxLength) &&
        Objects.equals(this.maxLengthMetadata, formulaTab.maxLengthMetadata) &&
        Objects.equals(this.mergeField, formulaTab.mergeField) &&
        Objects.equals(this.mergeFieldXml, formulaTab.mergeFieldXml) &&
        Objects.equals(this.name, formulaTab.name) &&
        Objects.equals(this.nameMetadata, formulaTab.nameMetadata) &&
        Objects.equals(this.originalValue, formulaTab.originalValue) &&
        Objects.equals(this.originalValueMetadata, formulaTab.originalValueMetadata) &&
        Objects.equals(this.pageNumber, formulaTab.pageNumber) &&
        Objects.equals(this.pageNumberMetadata, formulaTab.pageNumberMetadata) &&
        Objects.equals(this.paymentDetails, formulaTab.paymentDetails) &&
        Objects.equals(this.recipientId, formulaTab.recipientId) &&
        Objects.equals(this.recipientIdGuid, formulaTab.recipientIdGuid) &&
        Objects.equals(this.recipientIdGuidMetadata, formulaTab.recipientIdGuidMetadata) &&
        Objects.equals(this.recipientIdMetadata, formulaTab.recipientIdMetadata) &&
        Objects.equals(this.requireAll, formulaTab.requireAll) &&
        Objects.equals(this.requireAllMetadata, formulaTab.requireAllMetadata) &&
        Objects.equals(this.required, formulaTab.required) &&
        Objects.equals(this.requiredMetadata, formulaTab.requiredMetadata) &&
        Objects.equals(this.requireInitialOnSharedChange, formulaTab.requireInitialOnSharedChange) &&
        Objects.equals(this.requireInitialOnSharedChangeMetadata, formulaTab.requireInitialOnSharedChangeMetadata) &&
        Objects.equals(this.roundDecimalPlaces, formulaTab.roundDecimalPlaces) &&
        Objects.equals(this.roundDecimalPlacesMetadata, formulaTab.roundDecimalPlacesMetadata) &&
        Objects.equals(this.senderRequired, formulaTab.senderRequired) &&
        Objects.equals(this.senderRequiredMetadata, formulaTab.senderRequiredMetadata) &&
        Objects.equals(this.shared, formulaTab.shared) &&
        Objects.equals(this.sharedMetadata, formulaTab.sharedMetadata) &&
        Objects.equals(this.shareToRecipients, formulaTab.shareToRecipients) &&
        Objects.equals(this.shareToRecipientsMetadata, formulaTab.shareToRecipientsMetadata) &&
        Objects.equals(this.smartContractInformation, formulaTab.smartContractInformation) &&
        Objects.equals(this.source, formulaTab.source) &&
        Objects.equals(this.status, formulaTab.status) &&
        Objects.equals(this.statusMetadata, formulaTab.statusMetadata) &&
        Objects.equals(this.tabGroupLabels, formulaTab.tabGroupLabels) &&
        Objects.equals(this.tabGroupLabelsMetadata, formulaTab.tabGroupLabelsMetadata) &&
        Objects.equals(this.tabId, formulaTab.tabId) &&
        Objects.equals(this.tabIdMetadata, formulaTab.tabIdMetadata) &&
        Objects.equals(this.tabLabel, formulaTab.tabLabel) &&
        Objects.equals(this.tabLabelMetadata, formulaTab.tabLabelMetadata) &&
        Objects.equals(this.tabOrder, formulaTab.tabOrder) &&
        Objects.equals(this.tabOrderMetadata, formulaTab.tabOrderMetadata) &&
        Objects.equals(this.tabType, formulaTab.tabType) &&
        Objects.equals(this.tabTypeMetadata, formulaTab.tabTypeMetadata) &&
        Objects.equals(this.templateLocked, formulaTab.templateLocked) &&
        Objects.equals(this.templateLockedMetadata, formulaTab.templateLockedMetadata) &&
        Objects.equals(this.templateRequired, formulaTab.templateRequired) &&
        Objects.equals(this.templateRequiredMetadata, formulaTab.templateRequiredMetadata) &&
        Objects.equals(this.tooltip, formulaTab.tooltip) &&
        Objects.equals(this.toolTipMetadata, formulaTab.toolTipMetadata) &&
        Objects.equals(this.underline, formulaTab.underline) &&
        Objects.equals(this.underlineMetadata, formulaTab.underlineMetadata) &&
        Objects.equals(this.validationMessage, formulaTab.validationMessage) &&
        Objects.equals(this.validationMessageMetadata, formulaTab.validationMessageMetadata) &&
        Objects.equals(this.validationPattern, formulaTab.validationPattern) &&
        Objects.equals(this.validationPatternMetadata, formulaTab.validationPatternMetadata) &&
        Objects.equals(this.value, formulaTab.value) &&
        Objects.equals(this.valueMetadata, formulaTab.valueMetadata) &&
        Objects.equals(this.width, formulaTab.width) &&
        Objects.equals(this.widthMetadata, formulaTab.widthMetadata) &&
        Objects.equals(this.xPosition, formulaTab.xPosition) &&
        Objects.equals(this.xPositionMetadata, formulaTab.xPositionMetadata) &&
        Objects.equals(this.yPosition, formulaTab.yPosition) &&
        Objects.equals(this.yPositionMetadata, formulaTab.yPositionMetadata);
  }

  /**
   * Returns the HashCode.
   */
  @Override
  public int hashCode() {
    return Objects.hash(anchorAllowWhiteSpaceInCharacters, anchorAllowWhiteSpaceInCharactersMetadata,
        anchorCaseSensitive, anchorCaseSensitiveMetadata, anchorHorizontalAlignment, anchorHorizontalAlignmentMetadata,
        anchorIgnoreIfNotPresent, anchorIgnoreIfNotPresentMetadata, anchorMatchWholeWord, anchorMatchWholeWordMetadata,
        anchorString, anchorStringMetadata, anchorTabProcessorVersion, anchorTabProcessorVersionMetadata, anchorUnits,
        anchorUnitsMetadata, anchorXOffset, anchorXOffsetMetadata, anchorYOffset, anchorYOffsetMetadata, bold,
        boldMetadata, caption, captionMetadata, concealValueOnDocument, concealValueOnDocumentMetadata,
        conditionalParentLabel, conditionalParentLabelMetadata, conditionalParentValue, conditionalParentValueMetadata,
        customTabId, customTabIdMetadata, disableAutoSize, disableAutoSizeMetadata, documentId, documentIdMetadata,
        errorDetails, font, fontColor, fontColorMetadata, fontMetadata, fontSize, fontSizeMetadata, formOrder,
        formOrderMetadata, formPageLabel, formPageLabelMetadata, formPageNumber, formPageNumberMetadata, formula,
        formulaMetadata, height, heightMetadata, hidden, hiddenMetadata, isPaymentAmount, isPaymentAmountMetadata,
        italic, italicMetadata, localePolicy, locked, lockedMetadata, maxLength, maxLengthMetadata, mergeField,
        mergeFieldXml, name, nameMetadata, originalValue, originalValueMetadata, pageNumber, pageNumberMetadata,
        paymentDetails, recipientId, recipientIdGuid, recipientIdGuidMetadata, recipientIdMetadata, requireAll,
        requireAllMetadata, required, requiredMetadata, requireInitialOnSharedChange,
        requireInitialOnSharedChangeMetadata, roundDecimalPlaces, roundDecimalPlacesMetadata, senderRequired,
        senderRequiredMetadata, shared, sharedMetadata, shareToRecipients, shareToRecipientsMetadata,
        smartContractInformation, source, status, statusMetadata, tabGroupLabels, tabGroupLabelsMetadata, tabId,
        tabIdMetadata, tabLabel, tabLabelMetadata, tabOrder, tabOrderMetadata, tabType, tabTypeMetadata, templateLocked,
        templateLockedMetadata, templateRequired, templateRequiredMetadata, tooltip, toolTipMetadata, underline,
        underlineMetadata, validationMessage, validationMessageMetadata, validationPattern, validationPatternMetadata,
        value, valueMetadata, width, widthMetadata, xPosition, xPositionMetadata, yPosition, yPositionMetadata);
  }

  /**
   * Converts the given object to string.
   */
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaTab {\n");

    sb.append("    anchorAllowWhiteSpaceInCharacters: ").append(toIndentedString(anchorAllowWhiteSpaceInCharacters))
        .append("\n");
    sb.append("    anchorAllowWhiteSpaceInCharactersMetadata: ")
        .append(toIndentedString(anchorAllowWhiteSpaceInCharactersMetadata)).append("\n");
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorCaseSensitiveMetadata: ").append(toIndentedString(anchorCaseSensitiveMetadata)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorHorizontalAlignmentMetadata: ").append(toIndentedString(anchorHorizontalAlignmentMetadata))
        .append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorIgnoreIfNotPresentMetadata: ").append(toIndentedString(anchorIgnoreIfNotPresentMetadata))
        .append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorMatchWholeWordMetadata: ").append(toIndentedString(anchorMatchWholeWordMetadata)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorStringMetadata: ").append(toIndentedString(anchorStringMetadata)).append("\n");
    sb.append("    anchorTabProcessorVersion: ").append(toIndentedString(anchorTabProcessorVersion)).append("\n");
    sb.append("    anchorTabProcessorVersionMetadata: ").append(toIndentedString(anchorTabProcessorVersionMetadata))
        .append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorUnitsMetadata: ").append(toIndentedString(anchorUnitsMetadata)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorXOffsetMetadata: ").append(toIndentedString(anchorXOffsetMetadata)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    anchorYOffsetMetadata: ").append(toIndentedString(anchorYOffsetMetadata)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    boldMetadata: ").append(toIndentedString(boldMetadata)).append("\n");
    sb.append("    caption: ").append(toIndentedString(caption)).append("\n");
    sb.append("    captionMetadata: ").append(toIndentedString(captionMetadata)).append("\n");
    sb.append("    concealValueOnDocument: ").append(toIndentedString(concealValueOnDocument)).append("\n");
    sb.append("    concealValueOnDocumentMetadata: ").append(toIndentedString(concealValueOnDocumentMetadata))
        .append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentLabelMetadata: ").append(toIndentedString(conditionalParentLabelMetadata))
        .append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    conditionalParentValueMetadata: ").append(toIndentedString(conditionalParentValueMetadata))
        .append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    customTabIdMetadata: ").append(toIndentedString(customTabIdMetadata)).append("\n");
    sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
    sb.append("    disableAutoSizeMetadata: ").append(toIndentedString(disableAutoSizeMetadata)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentIdMetadata: ").append(toIndentedString(documentIdMetadata)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontColorMetadata: ").append(toIndentedString(fontColorMetadata)).append("\n");
    sb.append("    fontMetadata: ").append(toIndentedString(fontMetadata)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    fontSizeMetadata: ").append(toIndentedString(fontSizeMetadata)).append("\n");
    sb.append("    formOrder: ").append(toIndentedString(formOrder)).append("\n");
    sb.append("    formOrderMetadata: ").append(toIndentedString(formOrderMetadata)).append("\n");
    sb.append("    formPageLabel: ").append(toIndentedString(formPageLabel)).append("\n");
    sb.append("    formPageLabelMetadata: ").append(toIndentedString(formPageLabelMetadata)).append("\n");
    sb.append("    formPageNumber: ").append(toIndentedString(formPageNumber)).append("\n");
    sb.append("    formPageNumberMetadata: ").append(toIndentedString(formPageNumberMetadata)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    formulaMetadata: ").append(toIndentedString(formulaMetadata)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    heightMetadata: ").append(toIndentedString(heightMetadata)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    hiddenMetadata: ").append(toIndentedString(hiddenMetadata)).append("\n");
    sb.append("    isPaymentAmount: ").append(toIndentedString(isPaymentAmount)).append("\n");
    sb.append("    isPaymentAmountMetadata: ").append(toIndentedString(isPaymentAmountMetadata)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    italicMetadata: ").append(toIndentedString(italicMetadata)).append("\n");
    sb.append("    localePolicy: ").append(toIndentedString(localePolicy)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    lockedMetadata: ").append(toIndentedString(lockedMetadata)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    maxLengthMetadata: ").append(toIndentedString(maxLengthMetadata)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    mergeFieldXml: ").append(toIndentedString(mergeFieldXml)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameMetadata: ").append(toIndentedString(nameMetadata)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    originalValueMetadata: ").append(toIndentedString(originalValueMetadata)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageNumberMetadata: ").append(toIndentedString(pageNumberMetadata)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    recipientIdGuid: ").append(toIndentedString(recipientIdGuid)).append("\n");
    sb.append("    recipientIdGuidMetadata: ").append(toIndentedString(recipientIdGuidMetadata)).append("\n");
    sb.append("    recipientIdMetadata: ").append(toIndentedString(recipientIdMetadata)).append("\n");
    sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
    sb.append("    requireAllMetadata: ").append(toIndentedString(requireAllMetadata)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requiredMetadata: ").append(toIndentedString(requiredMetadata)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    requireInitialOnSharedChangeMetadata: ")
        .append(toIndentedString(requireInitialOnSharedChangeMetadata)).append("\n");
    sb.append("    roundDecimalPlaces: ").append(toIndentedString(roundDecimalPlaces)).append("\n");
    sb.append("    roundDecimalPlacesMetadata: ").append(toIndentedString(roundDecimalPlacesMetadata)).append("\n");
    sb.append("    senderRequired: ").append(toIndentedString(senderRequired)).append("\n");
    sb.append("    senderRequiredMetadata: ").append(toIndentedString(senderRequiredMetadata)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    sharedMetadata: ").append(toIndentedString(sharedMetadata)).append("\n");
    sb.append("    shareToRecipients: ").append(toIndentedString(shareToRecipients)).append("\n");
    sb.append("    shareToRecipientsMetadata: ").append(toIndentedString(shareToRecipientsMetadata)).append("\n");
    sb.append("    smartContractInformation: ").append(toIndentedString(smartContractInformation)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusMetadata: ").append(toIndentedString(statusMetadata)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabGroupLabelsMetadata: ").append(toIndentedString(tabGroupLabelsMetadata)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabIdMetadata: ").append(toIndentedString(tabIdMetadata)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    tabLabelMetadata: ").append(toIndentedString(tabLabelMetadata)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    sb.append("    tabOrderMetadata: ").append(toIndentedString(tabOrderMetadata)).append("\n");
    sb.append("    tabType: ").append(toIndentedString(tabType)).append("\n");
    sb.append("    tabTypeMetadata: ").append(toIndentedString(tabTypeMetadata)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateLockedMetadata: ").append(toIndentedString(templateLockedMetadata)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    templateRequiredMetadata: ").append(toIndentedString(templateRequiredMetadata)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    toolTipMetadata: ").append(toIndentedString(toolTipMetadata)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    underlineMetadata: ").append(toIndentedString(underlineMetadata)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationMessageMetadata: ").append(toIndentedString(validationMessageMetadata)).append("\n");
    sb.append("    validationPattern: ").append(toIndentedString(validationPattern)).append("\n");
    sb.append("    validationPatternMetadata: ").append(toIndentedString(validationPatternMetadata)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valueMetadata: ").append(toIndentedString(valueMetadata)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    widthMetadata: ").append(toIndentedString(widthMetadata)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    xPositionMetadata: ").append(toIndentedString(xPositionMetadata)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
    sb.append("    yPositionMetadata: ").append(toIndentedString(yPositionMetadata)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
