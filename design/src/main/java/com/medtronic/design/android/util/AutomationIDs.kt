package com.medtronic.design.android.util

object AutomationIDs {
    object Common {
        const val LABEL = "label"
        const val ICON = "icon"
        const val TITLE = "title"
        const val PLACEHOLDER = "placeholder"
        const val POPOVER = "popover"
        const val OPTION = "option_"
        const val INDICATOR = "indicator"
    }

    object Banner {
        const val ICON = "banner_icon"
        const val MESSAGE = "banner_message"
        const val LINK = "banner_link_text"
        const val ACTION = "banner_action_button"
    }

    object BillboardBanner {
        const val LOGO = "bbb_logo"
        const val APP_NAME = "bbb_app_name"
        const val MENU = "bbb_menu"
        const val CONTENT = "bbb_content"
        const val HELP_LINK = "bbb_help_link"
        const val ACTION_BUTTON = "bbb_action_button"
        const val PAGINATION = "bbb_pagination"
    }

    object Button {
        const val LABEL = Common.LABEL
        const val ICON = Common.ICON
    }

    object Card {
        const val THUMBNAIL = "thumbnail"
        const val TITLE = Common.TITLE
        const val SUBTEXT = "subtext"
        const val INDICATOR = Common.INDICATOR
    }

    object ChoicePicker {
        const val LABEL = Common.LABEL
        const val ICON = Common.ICON
        const val INDICATOR = Common.INDICATOR
    }

    object Dialog {
        const val ICON = Common.ICON
        const val TITLE = Common.TITLE
        const val DESCRIPTION = "description"
        const val PRIMARY_BUTTON = "primary_button"
        const val SECONDARY_BUTTON = "secondary_button"
    }

    object FormField {
        const val LABEL = Common.LABEL
        const val PLACEHOLDER = Common.PLACEHOLDER
        const val SUPPORTING_TEXT = "supporting_text"
        const val CLEAR = "clear"
        const val TRAILING = "trailing"
    }

    object KeypadField {
        const val PLACEHOLDER = Common.PLACEHOLDER
        const val VALUE = "value"
    }

    object ActionMenu {
        const val MENU = "medtronic_action_menu"
        const val BUTTON = "button"
        const val POPOVER = Common.POPOVER
    }

    object DropdownMenu {
        const val MENU = "menu"
        const val SELECTOR = "selector"
        const val SELECTED_OPTION_LABEL = "selected_option_label"
        const val POPOVER = Common.POPOVER
        const val OPTION_LABEL = "option_label"
        const val OPTION_LEADING_ICON = "option_leading_icon"
        const val OPTION_TRAILING_ICON = "option_trailing_icon"
        const val SELECTION_INDICATOR = "selection_indicator"
    }

    object Paginator {
        const val DOT = "dot_"
        const val ACTIVE_DOT = "active_dot_"
        const val CURRENT_PAGE = "current_page"
        const val TOTAL_PAGES = "total_pages"
    }

    object BottomSheet {
        const val DRAG_HANDLE = "drag_handle"
        const val BACK_BUTTON = "back_button"
        const val TITLE = Common.TITLE
        const val CLOSE_BUTTON = "close"
    }

    fun getOptionAutomationId(index: Int): String {
        return "${Common.OPTION}$index"
    }
}
