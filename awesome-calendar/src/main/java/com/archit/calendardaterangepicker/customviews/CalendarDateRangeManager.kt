package com.archit.calendardaterangepicker.customviews

import java.util.Calendar

interface CalendarDateRangeManager {

    enum class CalendarRangeType {
        NOT_IN_RANGE,
        START_DATE,
        MIDDLE_DATE,
        LAST_DATE
    }

    companion object {
        const val DATE_FORMAT = "yyyyMMddHHmm"
    }

    fun setVisibleMonths(startMonth: Calendar, endMonth: Calendar)

    fun getStartVisibleMonth(): Calendar

    fun getEndVisibleMonth(): Calendar

    fun setSelectableDateRange(startDate: Calendar, endDate: Calendar)

    fun setSelectedDateRange(startDate: Calendar, endDate: Calendar?)

    fun resetSelectedDateRange()

    fun getMaxSelectedDate(): Calendar?

    fun getMinSelectedDate(): Calendar?

    fun getVisibleMonthDataList(): List<Calendar>

    fun getMonthIndex(month: Calendar): Int

    fun isSelectableDate(date: Calendar): Boolean

    fun checkDateRange(selectedDate: Calendar): CalendarRangeType
}